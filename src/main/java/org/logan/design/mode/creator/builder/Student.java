package org.logan.design.mode.creator.builder;

/**
 * desc: 使用 Builder设计模式创建 Student实例 <br/>
 * time: 2018/8/5 上午9:56 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Student {

	//4，所有属性只提供getter，setter工作由builder去完成（真正赋值在构造器内完成）。
	private final int id;
	private final String name;
	private final String sex;
	private final String address;

	/**
	 * 3,实体类构造器注意事项
	 * (1)，私有化构造函数。
	 * (2)，通过builder，完成实体类所有属性的赋值工作。
	 */
	private Student(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.sex = builder.sex;
		this.address = builder.address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getAddress() {
		return address;
	}

	// 1, 创建 static 构建器
	public static class Builder {

		// 2，提供所有实体类属性
		private final int id;
		private String name;
		private String sex;
		private String address;

		// 5，公开构建器 (必要参数通过构造函数传入)
		public Builder(int id, String name) {
			this.id = id;
			this.name = name;
		}

		// 6，提供属性赋值函数，并返回构建器
		public Builder sex(String sex) {
			this.sex = sex;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		// 7，通过build函数构建真正对象，传入builder，返回真正的对象。
		public Student build() {
			return new Student(this);
		}
	}


	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
