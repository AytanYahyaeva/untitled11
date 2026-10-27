#
#1. İstifadəçi qeydiyyatı və login
#Demo saytda test istifadəçisi yarat, hesab məlumatlarını saxla və həmin istifadəçi ilə sistemə daxil ol.
#
#2. Hesab məlumatlarının yoxlanılması
#Accounts Overview səhifəsinə keç, hesab nömrəsinin və balans məlumatlarının göstərildiyini yoxla.
#
#3. Hesablar arasında pul köçürməsi
#Transfer Funds bölməsində mövcud iki hesabı seç və demo mühitində müəyyən məbləği köçür.
#
#4. Köçürmə nəticəsinin yoxlanılması
#Əməliyyatın uğurlu olması barədə mesajı yoxla. Saytın göstərdiyi nəticəyə əsasən transfer məlumatlarını təsdiqlə.
#
#5. Əməliyyat tarixçəsi
#Hesabın əməliyyat tarixçəsinə keç, mövcud əməliyyatı tap və onun detallarını yoxla.
#
#6. Negative test ssenariləri
#Boş sahələrlə göndərmə, etibarsız məbləğ və ya uyğun olmayan input üçün sistemin reaksiyasını yoxla. Yalnız saytın faktiki dəstəklədiyi validasiyaları test et.
#
#Texniki tələblər
#Login, hesab seçimi və pul köçürməsi üçün ayrı keyword-lər yazılmalıdır.
#
#Elementlər sabit id, name və ya uyğun CSS/XPath locator-ları ilə tapılmalıdır.
#
#Wait Until Element Is Visible və Wait Until Page Contains Element istifadə edilməlidir.
#
#Test məlumatları dəyişənlərdə saxlanılmalıdır.
#
#Hər testdən əvvəl və sonra lazım olan brauzer əməliyyatları Suite Setup, Test Setup, Test Teardown və ya uyğun teardown keyword-ləri ilə idarə edilməlidir.
#
#Eyni test məlumatları ilə təkrar icranın nəticəyə təsiri nəzərə alınmalıdır; demo saytın əvvəlki vəziyyətinə həmişə zəmanət yoxdur.
#
#Gözlənilən nəticə: İstifadəçinin bank hesabına daxil olmasını və demo pul köçürmə prosesini yoxlayan avtomatlaşdırılmış test suite.

*** Settings ***
Library         SeleniumLibrary
Test Setup      Open Browser      https://parabank.parasoft.com/parabank/index.htm    chrome
Test Teardown   Close Browser

*** Test Cases ***
#Register User Test
#    Register    Aytan    Yahyayeva    6    Sumgait    Sum    5005    055968    ssn    aytanyahyayeva    yahya04    yahya04
#    Page Should Contain    Your account was created successfully
#
#Login User Test
#    Login    aytanyahyayeva    yahya04
#    Page Should Contain    Accounts Overview

#Overview
#    Login     aytanyahyayeva    yahya04
#    Click Link    css:a[href*="overview.htm"]
#        Wait Until Page Contains Element    id=accountTable    10s
#        Page Should Contain    Account
#        Page Should Contain    Balance

Transfer and Check
    Login    aytanyahyayeva    yahya04
    Transfer Funds        100
    Page Should Contain    Transfer Complete!
    Check


*** Keywords ***
Register
    [Arguments]    ${first_name}    ${last_name}    ${street}    ${city}    ${state}    ${zip}    ${phone}    ${ssn}    ${username}    ${password}    ${repeated_password}
    Click Link    css:a[href*="register.htm"]
    Wait Until Element Is Visible    css=input[id="customer.firstName"]    10s
    Input Text        css=input[id="customer.firstName"]         ${first_name}
    Input Text        css=input[id="customer.lastName"]          ${last_name}
    Input Text        css=input[id="customer.address.street"]     ${street}
    Input Text        css=input[id="customer.address.city"]       ${city}
    Input Text        css=input[id="customer.address.state"]      ${state}
    Input Text        css=input[id="customer.address.zipCode"]    ${zip}
    Input Text        css=input[id="customer.phoneNumber"]        ${phone}
    Input Text        css=input[id="customer.ssn"]                ${ssn}
    Input Text        css=input[id="customer.username"]           ${username}
    Input Password    css=input[id="customer.password"]           ${password}
    Input Password    css=input[id="repeatedPassword"]            ${repeated_password}
    Click Button      css:input[value="Register"]

Login
    [Arguments]    ${username}    ${password}
    Wait Until Element Is Visible    name=username    10s
    Input Text        name=username    ${username}
    Input Password    name=password    ${password}
    Click Button      css:input[value="Log In"]
    Wait Until Page Contains Element    id=showOverview    10s


Transfer Funds
    [Arguments]    ${amount}
        Click Link    css:a[href*="transfer.htm"]
        Input Text        id=amount    ${amount}
        Click Button      css:input[value="Transfer"]

Check
    Click Link    css:a[href="overview.htm"]
    Page Should Contain     Accounts Overview
