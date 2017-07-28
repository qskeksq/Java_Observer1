import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, Display {    // Observer, DisplayElement implements
    

    Observable observable;                                // ��ϵ� Observable

    private float temperature;                        // �µ�
    private float humidity;                            // ����
    
    public CurrentConditionDisplay(Observable observable){         // ������ 
        this.observable = observable;                            // ��ϵ� Observable�� import
        observable.addObserver(this);                            // this(CurrentConditionPlay) �������� ���
    }
    
    @Override
    public void update(Observable obs, Object arg){                // update �� ���ο� ������ ����
        if(obs instanceof WeatherData){                            // Observable�� WeatherData���� Ȯ��
            WeatherData weatherData = (WeatherData)obs;            // WeatherData��  ��ȯ
            this.temperature = weatherData.getTemperature();    // �µ� �� ������
            this.humidity = weatherData.getHumidity();            // ������ ����
            display();                                            // �ֽ� �� ���
        }
    }

    @Override
    public void display() {                                        // ���
        System.out.println("���� �µ� : " + temperature + "��,  ���� ���� : " + humidity + "%");
        
    }

}

