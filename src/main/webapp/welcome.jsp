<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
</head>
<body>
<h1>Struts 2 Hello World Example</h1>

<h2>
    Hello
    <s:property value="userName"/>
</h2>

<table border="1">
    <s:iterator value="users">
        <tr>
            <td><s:property value="userName"/></td>
            <td><s:property value="firstName"/></td>
        </tr>

    </s:iterator>
</table>

<div id="mytable">
    <ol>
        <li v-for="user in users">
            {{ user.firstName }}
        </li>
    </ol>
</div>


<script>
    var app4 = new Vue({
        el: '#mytable',
        data: {
            users: []
        },
        created: function () {
            this.fetchData()
        },
        methods: {
            fetchData: function () {
                var xhr = new XMLHttpRequest()
                var self = this
                xhr.open('GET', 'http://localhost:8080/controllers/users')
                xhr.onload = function () {
                    self.users = JSON.parse(xhr.responseText)
                    console.log(xhr.responseText)
                }
                xhr.send()
            }
        }
    })
</script>

</body>
</html>