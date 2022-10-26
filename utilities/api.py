import requests

def test_home():
    """
    Tests the http request from the home page: status code 404
    """
    response = requests.get("http://127.0.0.1:8081")
    assert response.status_code == 404

def test_get_customer():
    """
    Tests http request for /customer: status code 204
    """
    response = requests.get("http://127.0.0.1:8081/customer")
    assert response.status_code == 204