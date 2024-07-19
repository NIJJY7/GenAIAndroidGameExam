package org.yjjin.lost_heirs.common;

public class Constant {
    public static final int EVENT_CG_MAX = 100;
    public static final int CHARACTER_COUNT = 4;
    public static final int LOVE_COUNT = 3; // 공략 가능 캐릭터
    public static final int EVENT_COUNT = 100; // 캐릭터당 이벤트 개수
    public static final int VARIABLE_COUNT = 100;
    public static final int SAVE_FILE_COUNT = 10;
    public static final String GAME_VERSION = "HeartbeatsIdol v1.0";
    public static final String DB_NAME = "lost_heirs.db";

    public static final int GM_INTRO			= 1;
    public static final int GM_ENDING			= 4;
    public static final int GM_PLAY				= 5;
    public static final int GM_MOVE				= 6;
    public static final int GM_LOAD				= 7;
    public static final int GM_SAVE				= 8;
    public static final int GM_CONFIG			= 15;

    public static class EventData {
        private static final String[] EVT = {
                // 송준수 25
                "001", "002", "003", "004", "005", "006", "007", "008", "009", "010",
                "011", "012", "013", "014", "015", "016", "017", "018", "019", "020",
                "021", "022", "023", "024", "025",
                // 송서현 25
                "101", "102", "103", "104", "105", "106", "107", "108", "109", "110",
                "111", "112", "113", "114", "115", "116", "117", "118", "119", "120",
                "121", "122", "123", "124", "125",
                // 송지우 25
                "201", "202", "203", "204", "205", "206", "207", "208", "209", "210",
                "211", "212", "213", "214", "215", "216", "217", "218", "219", "220",
                "221", "222", "223", "224", "225",
                // 공통 6
                "301", "302", "303", "304", "305", "306",
        };

        public static final int[] START_POINT = {
                -1,
                25 - 1,
                25 + 25 - 1,
                25 + 25 + 25 - 1,
        };

        public static final int[] END_POINT = {
                25,
                25 + 25,
                25 + 25 + 25,
                25 + 25 + 25 + 6,
        };

        public static String getEventData(int num) {
            return EVT[num];
        }

        public static int getEventDataSize() {
            return EVT.length;
        }
    }
}
