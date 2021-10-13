package souza.charles;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Campeonato{

    private List<Time> times;

    public Campeonato(){
        times = new LinkedList<>();
        times.add(new Time("São Paulo", "São Paulo"));
        times.add(new Time("Corinthians", "São Paulo"));
    }
    public void addTime(Time time){
        times.add(time);
    }
    public void removeTime(Time time){
        times.remove(time);
    }
    public int sizeOfTime(){
        return times.size();
    }

    public Iterator<Time> iteratorTime(){
        return times.iterator();
    }
}
