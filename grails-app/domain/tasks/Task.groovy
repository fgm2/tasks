package tasks

class Task {
	String complete
	String task
	Date requiredBy
	Categoria categoria
    Date dateCreated
    Date lastUpdated

    static constraints = {
      task(blank:false, nullable: false, size:3..80)
      requiredBy(blank:false, nullable:false)
      categoria(nullable:false)
      complete(blank:true, nullable:true)
    }

    def String toString(){
    	[id: this.id, task: this.task, complete: this.complete, requiredBy: this.requiredBy, categoria_nome: this.categoria.nome, categoria: this.categoria.id]
    }

    def toArray() {
        return [id: this.id, task: this.task, requiredBy: this.requiredBy.format('yyyy-MM-dd'), complete: this.complete, categoria_nome: this.categoria.nome, categoria: this.categoria.id]
    }

}
