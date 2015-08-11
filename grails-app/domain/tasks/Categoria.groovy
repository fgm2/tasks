package tasks

class Categoria {
	String nome
	Date dateCreated
	Date lastUpdated

	static constraints = {
        nome(blank:false, nullable: false, size:3..80)
    }

	static hasMany = [tasks:Task]

	String toString(){
		this.nome
	}

	def toArray(){
		[id: this.id, nome: this.nome]
	}
}
