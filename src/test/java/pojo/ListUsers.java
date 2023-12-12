package pojo;

import java.util.List;

public class ListUsers 
{

   int page;
   int per_page;
    int total;
    int total_pages;
    List<ListData> data;
   ListSupport support;
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public int getPer_page() {
	return per_page;
}
public void setPer_page(int per_page) {
	this.per_page = per_page;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getTotal_pages() {
	return total_pages;
}
public void setTotal_pages(int total_pages) {
	this.total_pages = total_pages;
}
public List<ListData> getData() {
	return data;
}
public void setData(List<ListData> data) {
	this.data = data;
}
public ListSupport getSupport() {
	return support;
}
public void setSupport(ListSupport support) {
	this.support = support;
}
}
