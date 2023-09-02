package meteo;

//Криво выводится дата, не придумала как по другому сделать
import java.time.LocalDateTime;

public class SaveST implements MeteoSensor{
    public SensorTemperature st;
    public SaveST(SensorTemperature st) {
        this.st = st;
    }

    @Override
    public int getId() {
        return st.identifier(); 
    }

    @Override
    public Float getTemperature() {
        return (float)st.temperature();
    }

    @Override
    public Float getHumidity() {
       return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime ldt = LocalDateTime.of(st.year(), st.day() / 30, st.day() % 30, st.second() / 3600, st.second()% 3600 / 60, st.second()%3600 %60);
        return ldt;
        }
    
}
