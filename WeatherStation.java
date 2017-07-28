

public class WeatherStation {

    static WeatherData weatherData;                    // weatherData Import
    
    
    static CurrentConditionDisplay currentDisplay;    //currentConditionDisplay
    static ForecastDisplay forecastDisplay;            // forecastDisplay
    
    public static void weatherStation(){            // weatherStation �ʱ�ȭ
        weatherData = new WeatherData();            // WeatherData ��ü ����
        
        currentDisplay = new CurrentConditionDisplay(weatherData);        // CurrentConditionDisplay ���� (WeatherData�� ������ ���)
        forecastDisplay = new ForecastDisplay(weatherData);                // ForecastDisplay ���� (WeatherData�� ������ ���)
    }
    
    // WeatherData�� setMeasurements �Լ� ����
    public static void changeWeather(float temp, float humity, float pressure) {  
        
        weatherData.setMeasurements(temp, humity, pressure);

    }
    
    
    public static void main(String[] args){
        
        weatherStation();                    // WeatherStation ����
        
        // WeatherStation���� ������ ��ȭ�� �Է��Ѵ�.
        System.out.println("-----������ ���Ѵ�.----");
        changeWeather(40, 50, 10);                    // WeatherData�� ���ο� ������ ����
                
        System.out.println("");
        
        System.out.println("-----������ ���Ѵ�.----");
        changeWeather(50, 60, 20);                    // WeatherData�� ���ο� ������ ����
        
        System.out.println("");
                
    }

}
