from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
import time

driver = webdriver.Firefox()
driver.maximize_window()

try:
    driver.get("https://training-support.net/webelements/mouse-events")
    time.sleep(2)

    print("Page title:", driver.title)

    actions = ActionChains(driver)

    cargo_lock = driver.find_element(By.ID, "cargo-lock")
    cargo_toml = driver.find_element(By.ID, "cargo-toml")

    actions.click(cargo_lock)\
           .move_to_element(cargo_toml)\
           .click()\
           .perform()

    time.sleep(1)
    print("Confirmation:", driver.find_element(By.ID, "result").text)

    src = driver.find_element(By.ID, "src")
    target = driver.find_element(By.ID, "target")

    actions.double_click(src)\
           .context_click(target)\
           .perform()

    time.sleep(1)

    open_option = driver.find_element(By.ID, "open")
    open_option.click()

    time.sleep(1)
    print("Confirmation:", driver.find_element(By.ID, "result").text)

finally:
    driver.quit()
