package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.List;
import java.util.Objects;

import com.coderscampus.assignment10.dto.mealdayplanner.Nutrients;
import com.coderscampus.assignment10.dto.mealdayplanner.Meals;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Thursday {
	@JsonProperty("meals")
	private List<Meals> meals;
	@JsonProperty("nutrients")
	private Nutrients nutrients;
	@Override
	public String toString() {
		return "Thursday [meals=" + meals + ", nutrients=" + nutrients + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(meals, nutrients);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thursday other = (Thursday) obj;
		return Objects.equals(meals, other.meals) && Objects.equals(nutrients, other.nutrients);
	}
	public List<Meals> getMeals() {
		return meals;
	}
	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
}