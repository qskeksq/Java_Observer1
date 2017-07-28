import java.util.Observable;

public class WeatherData extends Observable{       

    private float temperature;                           // �µ�
    private float humidity;                               // ����
    private float pressure;                             // ���
    
    public WeatherData(){

    }
    
  // ���ο� �����͸� ���� �޾� �����ϰ� ���ο� �����Ͱ� �������� �˸���.
  // ������̼�(WeatherStation)������ �ֱ������� �� �Լ��� ����� �ֽ� �����͸� �����Ѵ�.
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;   
        this.humidity = humidity; 
        this.pressure = pressure;
        measurementsChanged();
    }

   // ������ ���ο� ������ ������ �÷��� ���� �����ϰ�(setChanged())
   // �������鿡�� ���ο� �����͸� �����Ѵ�. (notifyObservers())
   public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    
   // �µ��� ��ȯ
    public float getTemperature(){
        return temperature;
    }

  // ������ ��ȯ
    public float getHumidity(){
        return humidity;
    }
    
  // ��а� ��ȯ
    public float getPressure(){
        return pressure;
    }

}

