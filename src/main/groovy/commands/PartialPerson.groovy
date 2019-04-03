package commands

import grails.validation.Validateable

class PartialPerson implements Validateable {
	Integer age
	Integer height

	static constraints = {
		importFrom Person
	}

	String toString(){
		"PartialPerson: $age, $height"
	}
}