<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
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

<div id="userTable">
    <ul>
        <li v-for="user in users">
            {{user.userName}} {{ user.firstName }}
        </li>
    </ul>
</div>


<script>
    var userList = new Vue({
        el: '#userTable',
        data: {
            users: []
        },
        created: function () {
            this.fetchData()
        },
        methods: {
            fetchData: function () {
                var self = this
                axios.get('/controllers/users')
                    .then(function (response) {
                        console.log(response.data);
                        self.users = response.data
                    })
                    .catch(function (error) {
                        console.log(error);
                    });
            }
        }
    })
</script>

</body>
</html>