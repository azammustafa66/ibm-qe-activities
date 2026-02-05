from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("https://training-support.net/webelements/target-practice")
driver.maximize_window()

print(driver.title)

third_header = driver.find_element(By.XPATH, "(//h1 | //h2 | //h3 | //h4 | //h5)[3]")
print(third_header.text)

fifth_header = driver.find_element(By.XPATH, "(//h1 | //h2 | //h3 | //h4 | //h5)[5]")
print(fifth_header.value_of_css_property("color"))

purple_button = driver.find_element(By.CSS_SELECTOR, ".bg-purple-500")
print(purple_button.get_attribute("class"))

slate_button = driver.find_element(By.CSS_SELECTOR, ".bg-slate-500")
print(slate_button.text)

driver.quit()
