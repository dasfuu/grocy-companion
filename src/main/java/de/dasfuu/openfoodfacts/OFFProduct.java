package de.dasfuu.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class OFFProduct {

    @JsonProperty("complete")
    private int complete;

    @JsonProperty("labels")
    private String labels;

    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("product_name_de")
    private String productNameDe;
    @JsonProperty("generic_name")
    private String genericName;

    @JsonProperty("generic_name_de")
    private String genericNameDe;
    @JsonProperty("product_quantity")
    private String productQuantity;

    @JsonProperty("quantity_imported")
    private String productQuantityImported;

    @JsonProperty("ingredients_text_de")
    private String ingredientsTextDe;

    @JsonProperty("ingredients_text")
    private String ingredientsText;

    @JsonProperty("brands")
    private String brands;

    @JsonProperty("brands_imported")
    private String brandsImported;

    @JsonProperty("id;")
    private String id;

    @JsonProperty("_id")
    private String _id;

    @JsonProperty("image_front_small_url")
    private String imageFrontSmallUrl;

    @JsonProperty("image_front_thumb_url")
    private String imageFrontThumbUrl;

    @JsonProperty("image_front_url")
    private String imageFrontUrl;

    @JsonProperty("image_ingredients_url")
    private String imageIngredientsUrl;

    @JsonProperty("image_ingredients_small_url")
    private String imageIngredientsSmallUrl;

    @JsonProperty("image_ingredients_thumb_url")
    private String imageIngredientsThumbUrl;

    @JsonProperty("image_nutrition_small_url")
    private String imageNutritionSmallUrl;

    @JsonProperty("image_nutrition_thumb_url")
    private String imageNutritionThumbUrl;

    @JsonProperty("image_nutrition_url")
    private String imageNutritionUrl;

    @JsonProperty("image_small_url")
    private String imageSmallUrl;

    @JsonProperty("image_thumb_url")
    private String imageThumbUrl;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("allergens")
    private String allergens;

    @JsonProperty("brands_tags")
    private List<String> brandsTags;

    @JsonProperty("allergens_from_ingredients")
    private String allergensFromIngredients;

    @JsonProperty("categories")
    private String categories;

    @JsonProperty("code")
    private String code;

    @JsonProperty("stores")
    private String stores;

    @JsonProperty("nova_group")
    private String novaGroup;

    @JsonProperty("nova_groups")
    private String novaGroups;

    @JsonProperty("packaging")
    private String packaging;

    @JsonProperty("purchase_places")
    private String purchasePlaces;


    public int getComplete() {
        return complete;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNameDe() {
        return productNameDe;
    }

    public void setProductNameDe(String productNameDe) {
        this.productNameDe = productNameDe;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getGenericNameDe() {
        return genericNameDe;
    }

    public void setGenericNameDe(String genericNameDe) {
        this.genericNameDe = genericNameDe;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductQuantityImported() {
        return productQuantityImported;
    }

    public void setProductQuantityImported(String productQuantityImported) {
        this.productQuantityImported = productQuantityImported;
    }

    public String getIngredientsTextDe() {
        return ingredientsTextDe;
    }

    public void setIngredientsTextDe(String ingredientsTextDe) {
        this.ingredientsTextDe = ingredientsTextDe;
    }

    public String getIngredientsText() {
        return ingredientsText;
    }

    public void setIngredientsText(String ingredientsText) {
        this.ingredientsText = ingredientsText;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getBrandsImported() {
        return brandsImported;
    }

    public void setBrandsImported(String brandsImported) {
        this.brandsImported = brandsImported;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getImageFrontSmallUrl() {
        return imageFrontSmallUrl;
    }

    public void setImageFrontSmallUrl(String imageFrontSmallUrl) {
        this.imageFrontSmallUrl = imageFrontSmallUrl;
    }

    public String getImageFrontThumbUrl() {
        return imageFrontThumbUrl;
    }

    public void setImageFrontThumbUrl(String imageFrontThumbUrl) {
        this.imageFrontThumbUrl = imageFrontThumbUrl;
    }

    public String getImageFrontUrl() {
        return imageFrontUrl;
    }

    public void setImageFrontUrl(String imageFrontUrl) {
        this.imageFrontUrl = imageFrontUrl;
    }

    public String getImageIngredientsUrl() {
        return imageIngredientsUrl;
    }

    public void setImageIngredientsUrl(String imageIngredientsUrl) {
        this.imageIngredientsUrl = imageIngredientsUrl;
    }

    public String getImageIngredientsSmallUrl() {
        return imageIngredientsSmallUrl;
    }

    public void setImageIngredientsSmallUrl(String imageIngredientsSmallUrl) {
        this.imageIngredientsSmallUrl = imageIngredientsSmallUrl;
    }

    public String getImageIngredientsThumbUrl() {
        return imageIngredientsThumbUrl;
    }

    public void setImageIngredientsThumbUrl(String imageIngredientsThumbUrl) {
        this.imageIngredientsThumbUrl = imageIngredientsThumbUrl;
    }

    public String getImageNutritionSmallUrl() {
        return imageNutritionSmallUrl;
    }

    public void setImageNutritionSmallUrl(String imageNutritionSmallUrl) {
        this.imageNutritionSmallUrl = imageNutritionSmallUrl;
    }

    public String getImageNutritionThumbUrl() {
        return imageNutritionThumbUrl;
    }

    public void setImageNutritionThumbUrl(String imageNutritionThumbUrl) {
        this.imageNutritionThumbUrl = imageNutritionThumbUrl;
    }

    public String getImageNutritionUrl() {
        return imageNutritionUrl;
    }

    public void setImageNutritionUrl(String imageNutritionUrl) {
        this.imageNutritionUrl = imageNutritionUrl;
    }

    public String getImageSmallUrl() {
        return imageSmallUrl;
    }

    public void setImageSmallUrl(String imageSmallUrl) {
        this.imageSmallUrl = imageSmallUrl;
    }

    public String getImageThumbUrl() {
        return imageThumbUrl;
    }

    public void setImageThumbUrl(String imageThumbUrl) {
        this.imageThumbUrl = imageThumbUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public List<String> getBrandsTags() {
        return brandsTags;
    }

    public void setBrandsTags(List<String> brandsTags) {
        this.brandsTags = brandsTags;
    }

    public String getAllergensFromIngredients() {
        return allergensFromIngredients;
    }

    public void setAllergensFromIngredients(String allergensFromIngredients) {
        this.allergensFromIngredients = allergensFromIngredients;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }

    public String getNovaGroup() {
        return novaGroup;
    }

    public void setNovaGroup(String novaGroup) {
        this.novaGroup = novaGroup;
    }

    public String getNovaGroups() {
        return novaGroups;
    }

    public void setNovaGroups(String novaGroups) {
        this.novaGroups = novaGroups;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getPurchasePlaces() {
        return purchasePlaces;
    }

    public void setPurchasePlaces(String purchasePlaces) {
        this.purchasePlaces = purchasePlaces;
    }
}