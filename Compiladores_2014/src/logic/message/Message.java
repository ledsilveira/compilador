package logic.message;

public class Message {
	
	private String name, description, solution;
        private int typeMessage, caracterError;
        //carcterError 0 mensagem padrão. 1 sucesso. 2 erro

	public Message(String name, String description, String solution, int typeMessage, int caracterError) {
		super();
		this.name = name;
		this.description = description;
		this.solution = solution;
		this.typeMessage = typeMessage;
                this.caracterError = caracterError;
	}

    public int getCaracterError() {
        return caracterError;
    }

    public void setCaracterError(int caracterError) {
        this.caracterError = caracterError;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public int getTypeMessage() {
		return typeMessage;
	}

	public void setTypeMessage(int typeMessage) {
		this.typeMessage = typeMessage;
	}

}
