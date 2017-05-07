package robertbeckwith.uiuctransfer;

/**
 * Created by rjbec on 5/6/2017.
 */

public class Transfers {
        private int code,uiuccode;
        private String symbol,name,cod,uiucsymbol,ssHum,westerneastern;


        public Transfers(String symbol, String name, int code, String cod, String uiucsymbol,int uiuccode, String ssHum,String westerneastern ) {
            this.setSymbol(symbol);
            this.setName(name);
            this.setCode(code);
            this.setCod(cod);
            this.setUiucsymbol(uiucsymbol);
            this.setUiuccode(uiuccode);
            this.setSsHum(ssHum);
            this.setWesterneastern(westerneastern);
        }
        public String getSymbol(){
            return symbol;
        }
        public void setSymbol(String symbol){
            this.symbol=symbol;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getCod() {
            return cod;
        }

        public void setCod(String cod) {
            this.cod = cod;
        }

        public String getUiucsymbol(){
            return uiucsymbol;
        }
        public void setUiucsymbol(String uiucsymbol){
            this.uiucsymbol=uiucsymbol;
        }

        public int getUiuccode(){
            return uiuccode;
        }
        public void setUiuccode(int uiuccode){
            this.uiuccode = uiuccode;
        }

        public String getSsHum(){
            return ssHum;
        }
        public void setSsHum(String ssHum){
            this.ssHum = ssHum;
        }

        public String getWesterneastern(){
            return westerneastern;
        }
        public void setWesterneastern(String westerneastern){
            this.westerneastern=westerneastern;
        }
    }