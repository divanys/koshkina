package second_cw;

abstract class Category {
    private String categoryName;
    private boolean packageQuantityORNetWeight;
    public Category(String categoryName, boolean packageQuantityORNetWeight) {
        setCategotyName(categoryName);
        setPackageQuantityORNetWeight(packageQuantityORNetWeight); }
    private void setPackageQuantityORNetWeight( boolean packageQuantityORNetWeight) {this.packageQuantityORNetWeight = packageQuantityORNetWeight; }
    private void setCategotyName(String categoryName) { this.categoryName = categoryName; }

    public String getCategoryName() { return categoryName; }

    public boolean isPackageQuantityORNetWeight() { return packageQuantityORNetWeight; }
}
