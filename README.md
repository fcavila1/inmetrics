# inmetrics
Desafio InMetrics

Clone o projeto e abra ele no Eclipse.<br/><br/>
1 - Ao abrir o projeto no Ecliple de um clique com o botão direito em cima do projeto, selecione <b>"Maven > Update Project"</b>, selecione o campo <b>"Force Update of Snapshots/Releases"</b> e clique em ok.<br/><br/>
2 - Abra o arquivo Utils.java localizado em "src/test/java/Utils". <br/><br/>
3 - no Campo "System.setProperty("webdriver.chrome.driver", <b>"c:\\drivers\\chromedriver.exe"</b>);" modifique a localização do chromedriver.exe para onde se encontra o driver em seu computador".<br/><br/>
4 - Abra o arquivo RunCucumberTest.java localizado em <b>"src\test\java\br\com\inmetrics\teste\runner"</b> e rode ele com o <b>"JunitTest"</b>.<br/><br/>

<h2>Rodar os testes e Visualizar os relatórios e evidências no Allure</h2><br/>
1 - Após instalar o allure na máquina rode os comandos abaixo:<br/><br/>
2 - Execute o cmd e abra a pasta onde se encontra o projeto, EX: <b>"C:\Users\Fernando\Documents\InMetrics\projetoClonado\Java\teste-inmetrics"</b>.<br/><br/>
3 - Execute o comando <b>"mvn clean test"</b>.<br/><br/>
4 - Após finalizar os testes execute o comando <b>"allure serve target/surefire-reports"</b>, e o browser abrirá o allure reports.

<h2>Visualizar evidências dos testes</h2>
1 - Abra a pasta Relatorios e Evidencias > cucumber-report e abra o arquivo <b>index.html</b>.
