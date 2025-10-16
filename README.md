# ✅ Comandos Java úteis

## 🔢 Operações matemáticas com `Math`
- `Math.pow(base, expoente)` – Eleva um número à potência desejada.
- `Math.sqrt(valor)` – Calcula a raiz quadrada de um valor.
- `Math.round(valor)` – Arredonda o valor para o inteiro mais próximo.
- `Math.PI` – Retorna o valor de π (pi), aproximadamente 3.14159.

---

## 🖨️ Impressão no console
- `System.out.println();` – Imprime texto no console com quebra de linha.
- `System.out.printf();` – Imprime texto com formatação (ex: números decimais formatados).

---

## 🔤 Leitura e manipulação de `String`
- `String nome = sc.nextLine();` – Lê uma linha de texto do usuário.
- `String usuario = sc.nextLine().toUpperCase();` – Lê texto e converte para maiúsculo.
- `String verbo = sc.nextLine().toLowerCase().trim();` – Lê texto, converte para minúsculo e remove espaços nas bordas.
- `texto = texto.replaceAll(" ", "").toLowerCase();` – Remove espaços e transforma o texto em minúsculas.
- `String invertida = new StringBuilder(texto).reverse().toString();` – Inverte o texto.
- `texto.equals(invertida)` – Compara se duas strings são iguais (útil para verificar palíndromos).
- `palavra.length();` – Retorna o tamanho da string.
- `palavra.substring(i);` – Retorna a parte da string a partir da posição `i`.

---

## 🔤 Comparações e verificações de texto
- `primeiroNome.equalsIgnoreCase("JOSE");` – Verifica se o nome é "JOSE", ignorando maiúsculas/minúsculas.
- `estado.equalsIgnoreCase("MG");` – Verifica se a sigla do estado é "MG", sem considerar letras maiúsculas.
- `palavra.startsWith("L");` – Verifica se a palavra começa com a letra "L".
- `verbo.endsWith("er");` – Verifica se o verbo termina com "er".

---

## 🔡 Manipulação de `char`
- `char tipo = Character.toUpperCase(sc.next().charAt(0));` – Lê um caractere e transforma em maiúsculo.
- `carro = Character.toUpperCase(carro);` – Converte o caractere `carro` para maiúsculo.
- `char sexo = sc.next().charAt(0);` – Lê o primeiro caractere digitado.
- `char sexo = Character.toUpperCase(sc.next().charAt(0));` – Lê e converte o caractere para maiúsculo.
- `char primeiraLetra = Character.toLowerCase(nome.charAt(0));` – Pega a primeira letra do nome e transforma em minúsculo.

---

## 🔢 Tipos numéricos e variáveis
- `double numero = sc.nextDouble();` – Lê um valor decimal do usuário.
- `int num = sc.nextInt();` – Lê um valor inteiro do usuário.
- `int num, menor = Integer.MAX_VALUE;` – Inicia a variável `menor` com o maior valor possível.
- `int maior = Integer.MIN_VALUE;` – Inicia a variável `maior` com o menor valor possível.

---

## 🔄 Conversão e extração de dados
- `Integer.parseInt(data.substring(0, 2));` – Extrai os dois primeiros dígitos de uma string (ex: "ddmmaaaa") e converte para inteiro.
