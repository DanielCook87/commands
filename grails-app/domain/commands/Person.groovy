package commands

class Person {
	String name
	Integer age
	Integer height

    static constraints = {
    	name nullable:false
    	age min:0, validator:{val, ob -> val != 7}
    	height unique:['age']
    }

    String toString(){
    	"Full Person: ${name}, ${age}"
    }
}
