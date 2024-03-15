<body>

<h1>Endpoint: <code>/api/analises/correlacao</code></h1>

<p>Este endpoint permite fazer o upload de um arquivo contendo dados para análise de correlação.</p>

<h2>Método HTTP: <code>POST</code></h2>

<h2>Descrição:</h2>
<p>Faz o upload de um arquivo contendo dados para análise de correlação e retorna uma lista de mapas representando as correlações encontradas.</p>

<h2>URL:</h2>
<p><code>/api/analises/correlacao</code></p>

<h2>Parâmetros de Requisição:</h2>
<ul>
    <li><code>file</code>: O arquivo contendo os dados para análise de correlação.</li>
</ul>

<h2>Tipo de Resposta:</h2>
<p>JSON</p>

<h2>Status de Resposta:</h2>
<ul>
    <li><code>200 OK</code>: Retorna a lista de mapas com as correlações calculadas.</li>
    <li><code>400 Bad Request</code>: Se ocorrer algum erro de requisição, como formato de arquivo inválido.</li>
    <li><code>500 Internal Server Error</code>: Se ocorrer um erro durante o processamento da análise.</li>
</ul>

<h2>Exemplo de Uso:</h2>
<pre><code>POST /api/analises/correlacao
Content-Type: multipart/form-data

[file content here]</code></pre>

<h2>Resposta de Exemplo:</h2>
<pre><code>[
  {
    "variavel1": "altura",
    "variavel2": "peso",
    "correlacao": "0.85"
  },
  {
    "variavel1": "idade",
    "variavel2": "pressao_arterial",
    "correlacao": "-0.72"
  }
]</code></pre>

<h2>Dependências:</h2>
<ul>
    <li>Java</li>
    <li>Spring Boot</li>
    <li>MultipartFile (Spring Framework)</li>
</ul>

</body>
