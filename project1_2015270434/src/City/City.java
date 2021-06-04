package City;

import Constants.Constants;

public class City {
    private String cityName;
    private int cost;
    private Constants.CITY_STATE cityState;

    public City(String cityName, int cost, Constants.CITY_STATE cityState) {
        this.cityName = cityName;
        this.cost = cost;
        this.cityState = cityState;
    }

    public Constants.CITY_STATE getCityState() {
        return cityState;
    }

    public void setCityState(Constants.CITY_STATE cityState) {
        this.cityState = cityState;
    }

    public String toString(){
        // city의 이름 가져오기 위한 오버라이딩
        return cityName;
    }
}
