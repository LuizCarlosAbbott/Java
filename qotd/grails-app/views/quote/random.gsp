<%--
  Created by IntelliJ IDEA.
  User: luizc
  Date: 11/02/2020
  Time: 12:02
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Random Quote</title>
    <g:javascript library="jquery" />
</head>
<body>
<div id="quote">
    <ul id="menu">
        <li>
            %{--            <g:remoteLink action="ajaxRandom" update="quote">--}%
            Next Quote
            %{--            </g:remoteLink>--}%
        </li>
        <li>
            <g:link action="ajaxRandom">
                Admin
            </g:link>
        </li>
    </ul>
    <q>${quote.content}</q>
    <p>${quote.author}</p>
</div>
</body>
</html>