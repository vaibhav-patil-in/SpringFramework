package guru.springframework.rest.controllers.v1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.rest.api.v1.model.CategoryDTO;
import guru.springframework.rest.api.v1.model.CategoryListDTO;
import guru.springframework.rest.service.CategoryService;

@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {

	public final static String BASE_URL = "/api/v1/categories";
	
	private final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public CategoryListDTO getAllCategories() {
		return new CategoryListDTO(categoryService.getAllCategories());
	}
	
	@GetMapping("/{name}")
	@ResponseStatus(HttpStatus.OK)
	public CategoryDTO getCategoryByName(@PathVariable String name) {
		return categoryService.getCategoryByName(name);
	}
}
