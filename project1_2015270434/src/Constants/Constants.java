package Constants;

import java.awt.*;

public class Constants {
    public static final int PLAYER_X = 4;
    public static final int PLAYER_Y = 86;
    public static final int COMPUTER_X = 38;
    public static final int COMPUTER_Y = 96;

    public static final Font FONT_TYPE = new Font("궁서 보통", Font.PLAIN, 15);

    public static final int DICE_X = 240;
    public static final int DICE_Y = 290;
    public static final int DICE_SIZE = 6;
    public static final int DICE_WIDTH = 90;
    public static final int DICE_HEIGHT = 90;

    public static final int AGENT_WIDTH = 40;
    public static final int AGENT_HEIGHT = 40;

    public static final int TILE_WIDTH = 80;
    public static final int TILE_HEIGHT = 80;
    public static final int TILE_PADDING = 60;

    public static final int MAX_BALANCE = 1000000;
    public static final int MAINFRAME_WIDTH = 577;
    public static final int MAINFRAME_HEIGHT = 660;
    public static final String MAINFRAME_TITLE = "BLUE MARBLE";

    public static final int BOARD_WIDTH = 7;
    public static final int BOARD_HEIGHT = 7;

    public static final int CITY_SIZE = 24;
    public static final int CITY_COST = 50000;
//    public static final String[] CITIES = {"시 작", "수 원", "용 인", "익 산", "전 주", "군 산", "무인도",
//                                           "경 주", "포 항", "대 구", "창 원", "부 산", "무인도",
//                                           "제 주", "여 수", "광 주", "춘 천", "강 릉", "무인도",
//                                           "청 주", "천 안", "대 전", "인 천", "서 울"};
    public static final String[] CITIES = {"시 작", "수 원", "용 인", "익 산", "전 주", "군 산", "무인도",
                                           "서 울", "경 주", "인 천", "포 항", "대 전", "대 구",
                                           "천 안", "창 원", "청 주", "부 산", "무인도", "강 릉",
                                           "춘 천", "광 주", "여 수", "제 주", "무인도"};


    public static final String DIR_RESOURCE = "src/resource/";
    public static final String DIR_TILE = "tile/";
    public static final String DIR_AGENT = "agent/";
    public static final String DIR_DICE = "dice/";
    public static final String DIR_STRUCTURE = "structure/";


    public enum CITY_STATE {free, owned_by_player, owned_by_computer}

    public enum TILE_TYPE {start, island, free, player, computer, none}
}
