package Board;

import City.City;
import Constants.Constants;

public class Tile {
    private int x;
    private int y;
    private City city;
    private Constants.TILE_TYPE tileType;

    // 좌표만 입력하는 생성자 (tiletype의 경우 기본으로 none으로 초기화됨)
    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
        this.tileType = Constants.TILE_TYPE.none;
    }

    // 각 멤버변수 getter & setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setTileType(Constants.TILE_TYPE tileType) {
        this.tileType = tileType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public City getCity() {
        return city;
    }

    public Constants.TILE_TYPE getTileType() {
        return tileType;
    }
}
