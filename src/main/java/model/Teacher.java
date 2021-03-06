package model;

public class Teacher {

	private int id;
	private String name;
	private int experience;

	public Teacher(String name, int experience) {
		this.name = name;
		this.experience = experience;
	}

	public Teacher(int id, String name, int experience) {
		this.id = id;
		this.name = name;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"id=" + id +
				", name='" + name + '\'' +
				", experience=" + experience +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Teacher teacher = (Teacher) o;

		return id == teacher.id;

	}
}
