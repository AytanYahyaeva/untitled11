#Tapşırıq 1. E-commerce saytının avtomatlaşdırılmış test edilməsi
#Layihə: E-commerce UI Testi
#Texnologiyalar: Python, Robot Framework, SeleniumLibrary
#Tələbələr login, məhsul seçimi, səbətə əlavə etmə və sifarişin tamamlanması proseslərini avtomatlaşdırmalıdırlar.
#1. Login testləri
#Düzgün istifadəçi məlumatları ilə daxil olmağı və səhv parol zamanı xəta mesajının göstərilməsini yoxla.
#2. Məhsulların yoxlanılması
#Products səhifəsinin açıldığını, məhsul adlarının və qiymətlərinin göründüyünü yoxla.
#3. Səbətə məhsul əlavə etmək
#Ən azı 2 məhsul seç, səbətə əlavə et və səbətdə məhsul sayının düzgün olduğunu yoxla.
#4. Səbətin yoxlanılması
#Səbət səhifəsində seçilmiş məhsulların adlarını və qiymətlərini yoxla.
#5. Checkout prosesi
#Ad, soyad və ZIP kodu daxil et, davam et və sifarişin yekun məbləğini yoxla.
#6. Sifarişi tamamlamaq
#Finish düyməsini kliklə və sifarişin uğurla tamamlandığını təsdiqlə.
#Texniki tələblər
#Bütün testlər Robot Framework sintaksisi ilə yazılmalıdır.
#Brauzer əməliyyatları SeleniumLibrary vasitəsilə icra edilməlidir.
#*** Settings ***, *** Variables ***, *** Test Cases *** və *** Keywords *** bölmələrindən istifadə edilməlidir.
#Login, məhsul seçimi və checkout kimi təkrarlanan əməliyyatlar üçün custom keyword-lər yaradılmalıdır.
#Testlərdə Should Be Equal, Page Should Contain və Element Should Be Visible kimi yoxlamalardan istifadə edilməlidir.
#Test nəticələri və uğursuzluqlar Robot Framework report və log fayllarında görünməlidir.
#Gözlənilən nəticə: Login-dən sifarişin tamamlanmasına qədər əsas alış-veriş ssenarisini avtomatik yoxlayan test suite.

*** Settings ***
Library         SeleniumLibrary
Test Setup      Open Browser    https://www.saucedemo.com/    chrome
Test Teardown   Close Browser

*** Test Cases ***
LoginTest
    Login     standard_user    secret_sauce

Invalid password
    Login     standard_user    invalid
    Element Should be visible     css:[data-test="error"]

Verify Products
     Login     standard_user    secret_sauce
     Page Should Contain       Products
     Element Should Be Visible     css:div[data-test="inventory-item-name"]
     Element Should Be Visible     css:div[data-test="inventory-item-price"]

Add Product to Card
    Login     standard_user    secret_sauce
    Card    add-to-cart-sauce-labs-bike-light
    Card    add-to-cart-sauce-labs-backpack
    Element Text Should Be    css=.shopping_cart_badge    2

Verify Card
    Login     standard_user    secret_sauce
    Card    add-to-cart-sauce-labs-bike-light
    Card    add-to-cart-sauce-labs-backpack
    Click Element    css:a[data-test="shopping-cart-link"]
    Page Should Contain    Sauce Labs Bike Light
    Page Should Contain    Sauce Labs Backpack

    Page Should Contain    $9.99
    Page Should Contain    $29.99

Buy Products
    Login     standard_user    secret_sauce
    Card    add-to-cart-sauce-labs-bike-light
    Card    add-to-cart-sauce-labs-backpack
    Click Element    css:a[data-test="shopping-cart-link"]
    Checkout    Aytan    Yahyayeva    5005


    
*** Keywords ***
Login
    [Arguments]    ${username}     ${password}
    Input Text     id=user-name     ${username}
    Input Password    id=password     ${password}
    Click Button      id=login-button

Card
    [Arguments]    ${product}
    Click Button    id=${product}

Checkout
    [Arguments]    ${name}    ${surname}     ${zip}
    Click Button    id=checkout
    Input Text    id=first-name     ${name}
    Input Text    id=last-name     ${surname}
    Input Text    id=postal-code     ${zip}
    Click Button    id=continue
    Click button    id=finish
    Page should Contain    Thank you for your order!
