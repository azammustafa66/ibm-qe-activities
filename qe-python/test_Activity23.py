# import pytest

# # -------- Fixture --------
# @pytest.fixture
# def number_list():
#     return list(range(11))   # 0 to 10


# -------- Test --------
def test_sum_of_list(number_list):
    assert sum(number_list) == 55
