from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Firefox()
driver.maximize_window()

# - Activity 5 -
driver.get("https://training-support.net/webelements")

print("Page Title:", driver.title)

heading = driver.find_element(By.XPATH, "//h1")
print("Is heading displayed?", heading.is_displayed())



# - Activity 6 -

driver.get("https://training-support.net/webelements/checkbox")
time.sleep(2)

checkbox = driver.find_element(By.XPATH, "//input[@type='checkbox']")
print("Is checkbox selected before click?", checkbox.is_selected())

checkbox.click()
print("Is checkbox selected after click?", checkbox.is_selected())


# - Activity 7 -
driver.get("https://training-support.net/webelements/dynamic-controls")
time.sleep(2)

text_field = driver.find_element(By.XPATH, "//input[@type='text']")
print("Is text field enabled before click?", text_field.is_enabled())

enable_button = driver.find_element(By.XPATH, "//button[contains(text(),'Enable')]")
enable_button.click()

time.sleep(3)
print("Is text field enabled after click?", text_field.is_enabled())

driver.quit()
