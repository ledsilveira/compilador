package gals;

public interface ParserConstants
{
    int START_SYMBOL = 56;

    int FIRST_NON_TERMINAL    = 56;
    int FIRST_SEMANTIC_ACTION = 91;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1,  1,  1, -1, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1,  2,  3, -1, -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1,  5, -1, -1, -1, -1, -1, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  5,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1,  8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 24, 25, 25, 25, -1, -1, -1, -1, -1, -1, 25, -1, -1, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 21, 23, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, 20, 20, -1, 20, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 10, -1,  9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 28, 26, -1, 27, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 18, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, -1, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, 37, 38, 40, -1, -1, 39, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, 34, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, -1, -1, -1, 47, -1, 46, 45, -1, -1, 44, -1, -1, -1, 47, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 50, 50, 50, 50, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, 52, -1, -1, -1, -1, 52, -1, -1, -1, 52, 52, -1, 52, -1, -1, 52, -1, 51, 51, 51, 51, 51, 51, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 54, 55, 56, 57, 58, -1, -1, -1, -1 },
        { -1, 65, 65, 65, 65, -1, -1, -1, -1, -1, -1, 65, -1, -1, -1, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, -1, -1, 61, 60, -1, -1, -1, 61, -1, -1, -1, 61, 61, -1, 61, -1, -1, 61, -1, 61, 61, 61, 61, 61, 61, 60, 60, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, 63, -1, -1 },
        { -1, 75, 76, 76, 76, -1, -1, -1, -1, -1, -1, 76, -1, -1, -1, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 72, -1, -1, -1, -1, -1, 74, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 73, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 66, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, 67, 67, -1, -1, 66, 67, -1, -1, -1, 67, 67, -1, 67, -1, -1, 67, -1, 67, 67, 67, 67, 67, 67, 67, 67, 66, 66 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, 69 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 81, -1, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 81, -1, -1, 81, 81, -1, -1, 81, 81, -1, 80, 78, 81, 81, 79, 81, -1, -1, 81, -1, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81 },
        { -1, -1, 86, 82, 83, -1, -1, -1, -1, -1, -1, 84, -1, -1, -1, 85, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, 30, 30, -1, -1, -1, 30, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, 30, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 77, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        {  6,  2, 34, 57, 36 },
        { 58, 59, 60, 43, 88, 44 },
        {  7,  2, 46, 62, 34, 58 },
        {  0 },
        { 15, 63, 35, 64, 34, 59 },
        {  0 },
        { 61, 34, 60 },
        {  0 },
        {  8,  2, 65, 66, 34, 57 },
        { 37, 68, 63, 35, 67, 69, 38 },
        {  0 },
        { 34, 68, 63, 35, 67, 69 },
        {  0 },
        { 35, 67 },
        {  0 },
        {  2, 70 },
        { 39, 63 },
        {  0 },
        { 19 },
        { 20 },
        { 67 },
        {  9, 40, 62, 41 },
        { 17, 40, 62, 42, 62, 41, 18, 67 },
        { 10, 43, 59, 44 },
        {  2 },
        { 86 },
        { 22 },
        { 24 },
        { 21 },
        { 25 },
        { 71, 89 },
        { 34, 71, 89 },
        {  0 },
        {  2, 72 },
        { 43, 88, 44 },
        { 23, 73, 13, 71, 74 },
        { 14, 73, 26, 71 },
        { 27, 37, 90, 38 },
        { 28, 37, 73, 75, 38 },
        { 32, 73 },
        {  0 },
        { 29, 71 },
        {  0 },
        { 45, 73 },
        { 40, 73, 41, 45, 73 },
        { 37, 73, 75, 38 },
        { 36,  2 },
        {  0 },
        { 39, 73, 75 },
        {  0 },
        { 76, 77 },
        { 78, 76 },
        {  0 },
        { 46 },
        { 47 },
        { 48 },
        { 49 },
        { 50 },
        { 51 },
        { 79, 80 },
        { 81, 79, 80 },
        {  0 },
        { 52 },
        { 53 },
        { 30 },
        { 82, 83 },
        { 84, 82, 83 },
        {  0 },
        { 54 },
        { 55 },
        { 11 },
        { 33 },
        { 31, 82 },
        { 53, 82 },
        { 37, 73, 38 },
        { 90 },
        { 86 },
        {  2, 85 },
        { 37, 73, 87, 38 },
        { 40, 73, 41 },
        { 36,  2 },
        {  0 },
        {  4 },
        {  5 },
        { 12 },
        { 16 },
        {  3 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado id",
        "Era esperado literal",
        "Era esperado num_int",
        "Era esperado num_real",
        "Era esperado programa",
        "Era esperado const",
        "Era esperado metodo",
        "Era esperado cadeia",
        "Era esperado registro",
        "Era esperado e",
        "Era esperado falso",
        "Era esperado entao",
        "Era esperado enquanto",
        "Era esperado var",
        "Era esperado verdadeiro",
        "Era esperado vetor",
        "Era esperado de",
        "Era esperado ref",
        "Era esperado val",
        "Era esperado booleano",
        "Era esperado inteiro",
        "Era esperado se",
        "Era esperado real",
        "Era esperado caracter",
        "Era esperado faca",
        "Era esperado leia",
        "Era esperado escreva",
        "Era esperado senao",
        "Era esperado ou",
        "Era esperado nao",
        "Era esperado retorne",
        "Era esperado div",
        "Era esperado \";\"",
        "Era esperado \":\"",
        "Era esperado \".\"",
        "Era esperado \"(\"",
        "Era esperado \")\"",
        "Era esperado \",\"",
        "Era esperado \"[\"",
        "Era esperado \"]\"",
        "Era esperado \"..\"",
        "Era esperado \"{\"",
        "Era esperado \"}\"",
        "Era esperado \":=\"",
        "Era esperado \"=\"",
        "Era esperado \"<\"",
        "Era esperado \">\"",
        "Era esperado \">=\"",
        "Era esperado \"<=\"",
        "Era esperado \"<>\"",
        "Era esperado \"+\"",
        "Era esperado \"-\"",
        "Era esperado \"*\"",
        "Era esperado \"/\"",
        "Era esperado programa",
        "Era esperado const, var, metodo ou {",//"<bloco> inv�lido",
        "Constante Esperado literal, id, num_int, num_real, falso, verdadeiro",// "<dcl_const> inv�lido",
        "Era esperado um id",//<dcl_var> inv�lido",
        "Declaração de metodo deve iniciar por metodo e cada umm terminado por ;","<dcl_metodos> inv�lido",
        "esperado metodo id () tipo;",//"<dcl_metodo> inv�lido",
        "Esperado constante definida por const id;",//"<constante> inv�lido",
        "Era seperado id ",//"<lid> inv�lido",
        "Tipo inválido, tipos são cadeia,vetor,registro, inteiro, real, booleano ou caracter",//"<tipo> inv�lido",
        "Era esperado ( ",// par formal
        "Era esperado :",//"<tipo_metodo> inválido",
        "Era esperado tipo ser inteiro, real, booleano ou caracter",
        "Era esperado ref ou val",//<mp_par> inválido",
        "Era esperado ref ou val :",//<mp_par> inválido","<rep_par> inv�lido",
        "Era esperado ,",//"<rep_lid> inv�lido",
        "Comando inválido. Esperado id, {, se, enquanto, leia,escreva,retorne",
        "Era esperado := , [, ( ou .",//"<rcomid> inv�lido",
        "Era esperado nao, - , (, inteiro, real, falso, verdadeiro, literal ou id",//"<expressao> inv�lido",
        "se nao parte inválido",//"<senaoparte> inv�lido",
        "Repetir expressão esperado uma , seguida da expressão",//"<rep_expr> inv�lido",
        "<expsimp> inválido",
        "<resto_expressao> inválido",
        "operador esperado =, <, > , <=, >=, <>",//"<oprel> inv�lido",
        "<termo> inválido",
        "<rep_expsimp> inválido",
        "operador adicionar deve ser +, - e ou",//"<op_add> inv�lido",
        "Fator deve ser nao, -, (, variavel ou constante explicita",//"<fator> inv�lido",
        "Esperado um operador multiplicador: * / e div",//"<rep_termo> inv�lido",
        "Era esperado *, / , e ou div",//"<op_mult> inv�lido",
        "Era esperado: (, [ ou .",//"<rvar> inv�lido",
        "Constante explícita esperado: inteiro, real, falso, verdadeiro, literal",//"<constante_explicita> inv�lido",
        "<rep_lexpr> inválido",
        "Lista de comando esperado: id, {, se, enquanto,leia,escreva e retorne",//"<lista_com> inv�lido",
        " Para repetir lista de comando esperado ; seguindo por comando",//"<rep_lista_com> inv�lido",
        "Variavel é composta por id",//<var> inv�lido"
    };
}
