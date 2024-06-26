package Lec98;

public class VLC extends Thread {
	boolean isopen;

//	public boolean open_VLC() {
//		isopen=true;
//		return true;
//
//	}
//	public boolean close_VLC() {
//		isopen=false;
//		return true;
//		
//	}
	@Override
	public void run() {
		if (isopen == false) {
			isopen = true;
		}
		System.out.println("Try to vlc open");
		try {
			Thread.sleep(4089);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Open Vlc");
	}

}
