
public class Smartphone {
	private String brand;
	private String model;
	private int storageCapacity;
	private int MAX_STORAGE_CAPACITY;
	
	public String getbrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		if (getbrand().length()<2 ) {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		if (getModel().length()<2 ) {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	public int getStorageCapacity() {
		return this.storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		if (getStorageCapacity() >=1 && getStorageCapacity() <=512) {
			this.storageCapacity = storageCapacity;
		}else {
			System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
		}
	}
	public int increaseStorage(int additionalStorage) {
		
		
		
		
		return additionalStorage;
	}

}
