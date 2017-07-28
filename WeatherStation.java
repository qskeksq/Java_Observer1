

public class WeatherStation {

    static WeatherData weatherData;                    // weatherData Import
    
    
    static CurrentConditionDisplay currentDisplay;    //currentConditionDisplay
    static ForecastDisplay forecastDisplay;            // forecastDisplay
    
    public static void weatherStation(){            // weatherStation 초기화
        weatherData = new WeatherData();            // WeatherData 객체 생성
        
        currentDisplay = new CurrentConditionDisplay(weatherData);        // CurrentConditionDisplay 생성 (WeatherData에 옵저버 등록)
        forecastDisplay = new ForecastDisplay(weatherData);                // ForecastDisplay 생성 (WeatherData에 옵저버 등록)
    }
    
    // WeatherData의 setMeasurements 함수 실행
    public static void changeWeather(float temp, float humity, float pressure) {  
        
        weatherData.setMeasurements(temp, humity, pressure);

    }
    
    
    public static void main(String[] args){
        
        weatherStation();                    // WeatherStation 생성
        
        // WeatherStation에서 날씨의 변화를 입력한다.
        System.out.println("-----날씨가 변한다.----");
        changeWeather(40, 50, 10);                    // WeatherData에 새로운 데이터 전송
                
        System.out.println("");
        
        System.out.println("-----날씨가 변한다.----");
        changeWeather(50, 60, 20);                    // WeatherData에 새로운 데이터 전송
        
        System.out.println("");
                
    }

}
