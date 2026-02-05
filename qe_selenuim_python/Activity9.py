from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from time import sleep

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/keyboard-events")
driver.maximize_window()

print(driver.title)

actions = ActionChains(driver)
actions.send_keys("string from Selenium script").perform()


result = driver.find_element(
    By.XPATH, "//p[@id='result']/following-sibling::h1"
)
print(result.text)

driver.quit()