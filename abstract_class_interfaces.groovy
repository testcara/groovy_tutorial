abstract class Door {
	public abstract void open()
	public abstract void close()
}

interface Alarm {
	public void alarm()
}

class AlarmDoor extends Door implements Alarm {
	
	public void open() {
		println("Open the door!")
	}

    public void close() {
    	println("Close the door!")
    }

    public void alarm() {
    	println("Alarm! Alarm! Alarm!")
    }
}

alarmdoor_1 = new AlarmDoor()
alarmdoor_1.open()
alarmdoor_1.close()
alarmdoor_1.alarm()