import java.util.Arrays;
import java.lang.Comparable;
public class LSC implements Comparable<LSC>{
	
	//instance variables
	private String stage;
        private String day;
        private String time;
	private String[] zones;

	//constructors
	public LSC(String stage, String day, String time){
		this.stage = stage;
		this.day = day;
		this.time = time;
		zones = null;
		}

	public LSC(String key){
		String[] info = key.split(" ",2);
                String[] varArray = info[0].split("_");
                String[] zoneArray = info[1].split(", ");
                
		stage = varArray[0];
		day = varArray[1];
		time = varArray[2];
		this.zones = zoneArray;
		}

	
	
	//methods
	public String toString(){
                return "Stage: "+ stage + " Day: " + day + " Time " + time + " Zones: " + Arrays.toString(zones);
                }

        public String getStage(){
                return stage;
                }

        public String getDay(){
                return day;
                }

        public String getTime(){
                return time;
                }

	public String getInfo(){
		return stage + " " + day + " " + time;
		}

	public String[] getZones(){
		return zones;
		}

	public int compareTo(LSC item){
		return this.getInfo().compareTo(item.getInfo());
		}




	}
	