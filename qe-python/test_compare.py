import pytest

@pytest.mark.group1
def test_greater():
    x=2
    y=3
    assert x>y


@pytest.mark.activity
def test_greater_equal():
    x=3
    y=3
    assert x>=y


@pytest.mark.activity
def test_lesser():
    x=4
    y=2
    assert y<x