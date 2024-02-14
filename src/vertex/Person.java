package vertex;

import java.util.Set;

public class Person {
	 
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents; 
    
    
 
   /* ---=== getters are supposed to be here. We skipped this part of code to make it simple ===--- */
 
  

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", height=" + height + ", weight="
				+ weight + ", parents=" + parents + "]";
	}

	public static class Builder {
       

		private Person newPerson;
 
        public Builder() {
            newPerson = new Person();
        }
 
        public Builder withName(String name){
            newPerson.setName(name);
            return this;
        }
 
        public Builder withSurname(String surname){
            newPerson.setSurname(surname);
            return this;
        }
 
        public Builder withAge(int age){
            newPerson.setAge(age);
            return this;
        }
 
        public Builder withHeight(int height){
            newPerson.setHeight(height);
            return this;
        }
 
        public Builder withWeight(int weight){
            newPerson.setWeight(weight);
            return this;
        }
 
        public Builder withParents(Set<Person> parents){
            newPerson.setParents(parents);
            return this;
        }
 
        public Person build(){
            return newPerson;
        }
 
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Set<Person> getParents() {
		return parents;
	}

	public void setParents(Set<Person> parents) {
		this.parents = parents;
	}
}