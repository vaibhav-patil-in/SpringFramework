package guru.springframework.rest.service;

import java.util.List;

import guru.springframework.rest.api.v1.model.CategoryDTO;

public interface CategoryService {

	List<CategoryDTO> getAllCategories();
	
	CategoryDTO getCategoryByName(String name);
}
