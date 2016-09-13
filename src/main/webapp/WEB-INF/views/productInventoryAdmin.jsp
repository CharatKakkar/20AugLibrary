<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<script>
$(document).ready(function() {
	   $('#productInventoryAdmin').DataTable( {
       "pagingType": "full_numbers",
    });   
} );
</script>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Inventory Page</h1>

            <p class="lead">This is the product inventory admin page!</p>
        </div>

         <table id="productInventoryAdmin"class="display nowrap dataTable dtr-inline collapsed" cellspacing="0" width="100%" role="grid" style="width: 100%;">  
                <thead>
            <tr class="bg-success">
                <th>Photo Thumb</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Condition</th>
                <th>Price</th>
                <th>Info</th>
                <th>Edit</th>
                <th>Remove</th>
            </tr>
            </thead>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td><img src="<c:url value="/resources/productImages/${product.productId}.png" /> " alt="image"
                             style="width:10%"/></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice} CAD</td>
                    <td><a href="<spring:url value="/product/viewProduct/${product.productId}" />"
                    >&nbsp&nbsp&nbsp&nbsp<span class="glyphicon glyphicon-info-sign"></span></a></td>
                    <td><a href="<spring:url value="/product/editProduct/${product.productId}" />"
                    >&nbsp&nbsp&nbsp&nbsp&nbsp<span class="glyphicon glyphicon-edit"></span></a></td>
                    <td><a href="<spring:url value="" />"
                    >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<span class="glyphicon glyphicon-remove-sign"></span></a></td>
                </tr>
                   
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/product/addProduct" />" class="btn btn-primary">Add Product</a>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>
