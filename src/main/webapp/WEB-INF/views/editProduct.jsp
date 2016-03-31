<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Edit Product</h1>
            <p class="lead">Update your product information here!</p>
        </div>

        <form:form aciton="${pageContext.request.contextPath}/admin/productInventory/editProduct" method="post" commandName="product" enctype="multipart/form-data">

        <div class="form-group">
            <label for="name">Name</label>
            <form:input path="productName" id="name" class="form-Control" value="${product.productName}" />
        </div>

        <div class="form-group">
            <label for="category">Category</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Mobile"/>Mobile</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Computers"/>Computers</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Clothes"/>Clothes</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Pets"/>Pets</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Hobbies"/>Hobbies</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Motorcycles"/>Motorcycles</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Appliances"/>Appliances</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Furniture"/>Furniture</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Baby Stuff"/>Baby Stuff</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Cars"/>Cars</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Real Estate"/>Real Estate</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="Services"/>Services</label>
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <form:textarea path="productDescription" rows="5" id="description" class="form-Control" value="${product.productDescription}"/>
        </div>

        <div class="form-group">
            <label for="price">Price</label>
            <form:input path="productPrice" id="price" class="form-Control" value="${product.productPrice}" />
        </div>

        <div class="form-group">
            <label for="condition">Condition</label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="new"/>New</label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="used"/>Used</label>
        </div>

        <div class="form-group">
            <label for="status">Status</label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="active"/>Active</label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="inactive"/>Inactive</label>
        </div>

        <div class="form-group">
            <label for="unitInStock">Units In Stock</label>
            <form:input path="unitInStock" id="unitInStock" class="form-Control" value="${product.unitInStock}"/>
        </div>

        <div class="form-group">
            <label for="manufacturer">Manufacturer</label>
            <form:input path="productManufacturer" id="manufacturer" class="form-Control" value="${product.productManufacturer}"/>
        </div>

        <div class="form-group">
            <label class="control-label" for="productImage">Upload Picture</label>
            <form:input path="productImage" id="productImage" type="file" class="form:input-large"/>
        </div>

        <br><br>
        <input type="submit" value="Edit" class="btn btn-default">
        <a href="<c:url value="/admin/productInventory"/>">Cancel</a>

        </form:form>


<%@ include file="/WEB-INF/views/template/footer.jsp"%>