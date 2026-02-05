from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/login-form/")
print(driver.title)
driver.maximize_window()
time.sleep(1)

driver.find_element(By.CSS_SELECTOR, "#username").send_keys("admin")
driver.find_element(By.CSS_SELECTOR, "#password").send_keys("password")
driver.find_element(By.XPATH, "//button[text()='Submit']").click()

time.sleep(1)
print(driver.title)
driver.quit()
