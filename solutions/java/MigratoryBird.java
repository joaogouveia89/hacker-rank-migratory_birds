public class MigratoryBird{
	private int id;
	private int frequency;

	public MigratoryBird(){
		this.id = 0;
		this.frequency = 0;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return this.id;
	}

	public int getFrequency(){
		return this.frequency;
	}

	public void restoreFrequency(){
		this.frequency = 1;
	}

	public void incrementFrequency(){
		this.frequency++;
	}

	public void copy(MigratoryBird bird){
		this.id = bird.getId();
		this.frequency = bird.getFrequency();
	}
}