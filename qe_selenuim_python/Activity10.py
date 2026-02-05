from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
import time

driver = webdriver.Firefox()
driver.maximize_window()

driver.get("https://training-support.net/webelements/drag-drop")
time.sleep(2)

print("Page title:", driver.title)

actions = ActionChains(driver)

ball = driver.find_element(By.ID, "ball")
dropzone1 = driver.find_element(By.ID, "dropzone1")
dropzone2 = driver.find_element(By.ID, "dropzone2")

actions.drag_and_drop(ball, dropzone1).perform()
time.sleep(1)
print("Dropzone 1:", dropzone1.text)

actions.drag_and_drop(ball, dropzone2).perform()
time.sleep(1)
print("Dropzone 2:", dropzone2.text)

time.sleep(3)
driver.quit()
