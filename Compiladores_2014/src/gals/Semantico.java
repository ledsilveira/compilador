package gals;

import com.sun.corba.se.impl.logging.ORBUtilSystemException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import simbolos.Simbolo;
import simbolos.TabelaDeSimbolos;

public class Semantico implements Constants
{
    TabelaDeSimbolos ts;
    Boolean Le_VAR;
    Boolean eh_registro;
    int nivel_atual;
    int deslocamento;
    int POSID;
    String contextoLID;
    String CategoriaAtual;  
    ArrayList <Integer>ListaReg;
    ArrayList <Integer>ListaVar;
    ArrayList <Integer>ListaAux;
    protected int NPF;
    String TipoAtual;
    private String TipoConst;
    private String ValCte;
    private String TipoLimiteInferior;
    private String ValorLimiteInferior;
    private String TipoElementos;
    private int deslocamentoVar;
    private int METODOID;
    private String MPP;
    private String TipoDoMetodo;
    private String TipoExpr;
    private String contextoEXPR;
    private String TipoFator;
    private String TipoVar;
    private String TipoTermo;
    private String TipoExpSimples;
    private int NPA;
    private String TipoVarIndexada;
    private String TipoLadoEsq;
    private int regAtual;
    private String OP_REL;
    private String TipoLimiteSuperior;
    private String ValorLimiteSuperior;
    
    public  Semantico()
    {
        this.TipoLadoEsq = "";
        this.TipoVarIndexada = "";
        this.NPA = 0;
        this.TipoExpSimples = "";
        this.TipoTermo = "";
        this.TipoVar = "";
        this.TipoFator = "";
        this.contextoEXPR ="";
        this.TipoExpr = "";
        this.TipoDoMetodo = "";
        this.TipoElementos = "";
        this.deslocamentoVar = -1;
        this.ValorLimiteInferior = "";
        this.TipoLimiteInferior = "";
        this.ValCte = "";
        this.TipoConst = "";
        this.TipoAtual = "";
        this.POSID = -1;
        this.CategoriaAtual = "";
        this.contextoLID = "";
        this.ts = new TabelaDeSimbolos();
        this.ListaReg = new ArrayList<>();
        this.ListaVar = new ArrayList<>();
        this.ListaAux = new ArrayList<>();
         
        
    }
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("Ação #"+action+", Token: "+token);
        switch( action )
        {
            case 101:
                this.metodo101( token );
                break;
            case 102:
                this.metodo102( token );
                break;
            case 103:
                this.metodo103( token );
                break;
            case 104:
                this.metodo104( token );
                break;
            case 105:
                this.metodo105( token );
                break;
            case 106:
                this.metodo106( token );
                break;
            case 107:
                this.metodo107( token );
                break;
            case 108:
                this.metodo108( token );
                break;
            case 109:
                this.metodo109( token );
                break;
            case 110:
                this.metodo110( token );
                break;
            case 111:
                this.metodo111( token );
                break;
            case 112:
                this.metodo112( token );
                break;
            case 113:
                this.metodo113( token );
                break;
            case 114:
                this.metodo114( token );
                break;
            case 115:
                this.metodo115( token );
                break;
            case 116:
                this.metodo116( token );
                break;
            case 117:
                this.metodo117( token );
                break;
            case 118:
                this.metodo118( token );
                break;
            case 119:
                this.metodo119( token );
                break;
            case 120:
                this.metodo120( token );
                break;
            case 121:
                this.metodo121( token );
                break;
            case 122:
                this.metodo122( token );
                break;
            case 123:
                this.metodo123( token );
                break;
            case 124:
                this.metodo124( token );
                break;
            case 125:
                this.metodo125( token );
                break;
            case 126:
                this.metodo126( token );
                break;
            case 127:
                this.metodo127( token );
                break;
            case 128:
                this.metodo128( token );
                break;
            case 129:
                this.metodo129( token );
                break;
            case 130:
                this.metodo130( token );
                break;
            case 131:
                this.metodo131( token );
                break;
            case 132:
                this.metodo132( token );
                break;
            case 133:
                this.metodo133( token );
                break;
            case 134:
                this.metodo134( token );
                break;
            case 135:
                this.metodo135( token );
                break;
            case 136:
                this.metodo136( token );
                break;
            case 137:
                this.metodo137( token );
                break;
            case 138:
                this.metodo138( token );
                break;
            case 139:
                this.metodo139( token );
                break;
            case 140:
                this.metodo140( token );
                break;
            case 141:
                this.metodo141( token );
                break;
            case 142:
                this.metodo142( token );
                break;
            case 143:
                this.metodo143( token );
                break;
            case 144:
                this.metodo144( token );
                break;
            case 145:
                this.metodo145( token );
                break;
            case 146:
                this.metodo146( token );
                break;
            case 147:
                this.metodo147( token );
                break;
            case 148:
                this.metodo148( token );
                break;
            case 149:
                this.metodo149( token );
                break;
            case 150:
                this.metodo150( token );
                break;
            case 151:
                this.metodo151( token );
                break;
            case 152:
                this.metodo152( token );
                break;
            case 153:
                this.metodo153( token );
                break;
            case 154:
                this.metodo154( token );
                break;
            case 155:
                this.metodo155( token );
                break;
            case 156:
                this.metodo156( token );
                break;
            case 157:
                this.metodo157( token );
                break;
            case 158:
                this.metodo158( token );
                break;
            case 159:
                this.metodo159( token );
                break;
            case 160:
                this.metodo160( token );
                break;
            case 161:
                this.metodo161( token );
                break;
            case 162:
                this.metodo162( token );
                break;
            case 163:
                this.metodo163( token );
                break;
            case 164:
                this.metodo164( token );
                break;
            case 165:
                this.metodo165( token );
                break;
            case 166:
                this.metodo166( token );
                break;
            case 167:
                this.metodo167( token );
                break;
            case 168:
                this.metodo168( token );
                break;
            case 169:
                this.metodo169( token );
                break;
            case 170:
                this.metodo170( token );
                break;
            case 171:
                this.metodo171( token );
                break;
            case 172:
                this.metodo172( token );
                break;
            case 173:
                this.metodo173( token );
                break;
            case 174:
                this.metodo174( token );
                break;
            case 175:
                this.metodo175( token );
                break;
            case 176:
                this.metodo176( token );
                break;
            case 177:
                this.metodo177( token );
                break;
            case 178:
                this.metodo178( token );
                break;
            case 179:
                this.metodo179( token );
                break;

        }
    }	

    private void metodo101(Token token) throws SemanticError {
        //instancia simbolo    
        Simbolo s = new Simbolo( token.getLexeme(),"ID-PROGRAMA" );
        s.setDeslocamento(0);
        //grava nivel atual da tabela de símbolos
        ts.setaNivelAtual(0);
        ts.adicionaSimbolo(s);
        //instancia valores
        this.eh_registro = false;
        this.Le_VAR = false;
        
        //throw new SemanticError("Not supported yet.", token.getPosition() ); //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo102(Token token) throws SemanticError {
        if ( this.ts.verificaIdDeclarado(token) )
        {
            throw new SemanticError("ID já declarado.", token.getPosition() );
        }
        Simbolo s = new Simbolo( token.getLexeme(),"ID-CONST" );
        this.ts.adicionaSimbolo(s);
        int posSimboloAtual = this.ts.getQuantiTotalElements()-1;
        this.POSID = posSimboloAtual;
    }

    private void metodo103(Token token) throws SemanticError {
        
        Simbolo constAtualiza = this.ts.pegaSimboloDaTSpelaPosicao(this.POSID);
        constAtualiza.setTipo(this.TipoConst);
        constAtualiza.setValor(this.ValCte);
        this.ts.atualizaElementoNaTS(this.POSID, constAtualiza);
    }
    private void metodo104(Token token) throws SemanticError {
        this.contextoLID = "decl";
        if ( this.eh_registro )
        {
            this.CategoriaAtual = "ID-CAMPO-DE-REGISTRO";
        }
        else
        {
            this.CategoriaAtual = "ID-VARIAVEL";
        }
    }
    private void metodo105(Token token) throws SemanticError {
        System.out.println("cateforia Atual: "+this.CategoriaAtual);
        System.out.println("Tipo Atual: "+this.TipoAtual);
        
        /**@todo método incompleto**/
        //Lista de registro
        Iterator<Integer> itVar;
        itVar = this.ListaVar.iterator();
        int deslocaTotal = 0;
        if( this.TipoAtual.equals("vetor"))
        {
            if( this.TipoLimiteSuperior.equals("caracter"))
            {
                deslocaTotal = this.ValorLimiteSuperior.compareTo(this.ValorLimiteInferior);
            }
            else
            {
                deslocaTotal = Integer.parseInt(this.ValorLimiteSuperior) - Integer.parseInt(this.ValorLimiteInferior);
            }
            
            System.out.println("Diferença = "+deslocaTotal);
            System.out.println("LimSup "+ValorLimiteSuperior);
            System.out.println("LimInf "+ValorLimiteInferior);
            
            
// int deslocaTotal = this.ValorLimiteInferior - this.
        }
        //Lista temporaria de variaveis do/s registros
        ArrayList<Simbolo> listaRegToVar = new ArrayList<>();
        while( itVar.hasNext() )
        {
            Integer nex = itVar.next();
            Simbolo s = this.ts.pegaSimboloDaTSpelaPosicao(nex);
            s.setCategoria(this.CategoriaAtual);
            s.setTipo(this.TipoAtual);
            s.setValorLimiteInferior(this.ValorLimiteInferior);
            s.setValorLimiteSuperior(this.ValorLimiteSuperior);
            this.deslocamentoVar++;
            s.setDeslocamento(this.deslocamentoVar);
            s.setTipoElementosVetor(this.TipoElementos);
            s.setTipoIndiceVetor(this.TipoLimiteSuperior);
            //inserir os elementos do vetor
            if( this.TipoAtual.equals("vetor") )
            {
                ArrayList<Simbolo> elementosVetor = new ArrayList<>();
                if( this.TipoLimiteSuperior.equals("caracter"))
                {
                    char limiteAtualS = this.ValorLimiteInferior.charAt(1);
                    System.out.println("AAAA"+deslocaTotal);
                    
                    for(int i =0; i<=deslocaTotal;i++)
                    {
                        //nome vai ser a posiçao do array ou algo.
                        Simbolo novo = new Simbolo(""+limiteAtualS);
                        novo.setTipo(this.TipoElementos);
                        limiteAtualS++;
                        elementosVetor.add(novo);
                    }
                }
                else
                {
                    int limiteAtualI = Integer.parseInt(this.ValorLimiteInferior);
                    System.out.println("vetor de int "+deslocaTotal);
                    
                    for(int i =0; i<=deslocaTotal;i++)
                    {
                        //nome vai ser a posiçao do array ou algo.
                        Simbolo novo = new Simbolo(""+limiteAtualI);
                        novo.setTipo(this.TipoElementos);
                        limiteAtualI++;
                        elementosVetor.add(novo);
                    }
                }
            
            
                
                if( elementosVetor.size() > 0 )
                    s.setElementosVetor(elementosVetor);
            }
            
            
            
            if( this.TipoAtual.equals("registro") )
            {
                boolean temRegistro= true;
                
                while( temRegistro )
                {
                    Simbolo vaiParaReg =  this.ts.getLastSimbolo();
                    int indiceApag = this.ts.getQuantiTotalElements() -1;
                    //verifica se id esta na lista var
                    Iterator<Integer> itVartEMP;
                    itVartEMP = this.ListaVar.iterator();
                    boolean elementoEVar = false;
                    while( itVartEMP.hasNext() )
                    {
                        int TEMP =  itVartEMP.next();
                        Simbolo maTemp = this.ts.pegaSimboloDaTSpelaPosicao(TEMP);
                        if( maTemp.getNome().equals(vaiParaReg.getNome()))
                        {
                            elementoEVar = true;
                        }
                    }
                    if( elementoEVar )
                    {
                       temRegistro = false; 
                    }
                    else
                    {
                        
                    
                        if( vaiParaReg.getCategoria().equals("ID-CAMPO-DE-REGISTRO"))
                        {
                            listaRegToVar.add(vaiParaReg);
                            this.ts.deleteSimboloPelaPosicao(indiceApag);
                        }
                        else
                        {
                            temRegistro = false;
                        }
                    }
                    
                }
                s.setElementosRegistros(listaRegToVar);
                System.out.println(" REGISTROOO salvar quando for 2 com mesmos valores "+s.getNome());
            }
            this.ts.atualizaElementoNaTS(nex, s);
        }
        //Lista de registro
        Iterator<Integer> itReg;
        itReg = this.ListaReg.iterator();
        while( itReg.hasNext() )
        {
            Integer nex = itReg.next();
            Simbolo s = this.ts.pegaSimboloDaTSpelaPosicao(nex);
            s.setCategoria(this.CategoriaAtual);
            
            s.setTipo(this.TipoAtual);
            this.deslocamentoVar++;
            s.setDeslocamento(this.deslocamentoVar);
            this.ts.atualizaElementoNaTS(nex, s);
        }
        
        
        //Verifica se existe uma lista de registro, pois se tiver lista de regitros primeiro limpa ela
        // e somente ela
        if( this.ListaReg.size() > 0)
        {
            
            this.ListaReg.clear();
        }
        // só apaga lista de variaveis quando não tiver uma lista de registros a validar
        else
        {
           if( this.ListaVar.size() > 0)
            {
                this.ListaVar.clear();
            } 
        }
        

        //Lista de variavel
    }
    private void metodo106(Token token) throws SemanticError {
        
        if ( this.ts.verificaIdDeclarado(token) )
        {
            throw new SemanticError("ID já declarado.", token.getPosition() );
        }
        Simbolo s = new Simbolo( token.getLexeme(),"ID-METODO" );
        this.NPF = 0;
        this.ts.adicionaSimbolo(s);
        int pos = this.ts.retornaPosicaoSimboloPeloID(token.getLexeme());
        System.out.println("pos "+pos);
        this.METODOID = pos;
        //incrementa nivel atual
        int na = this.ts.getNivelAtual();
        na++;
        this.ts.setaNivelAtual( na );
    }
    private void metodo107(Token token) throws SemanticError {
        
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo108(Token token) throws SemanticError {
        
       //pega posição na TS do metodo criado e inseri sua lista de parâmetros
        Simbolo metd = this.ts.pegaSimboloDaTSpelaPosicao(this.METODOID);
        metd.setTipo(this.TipoDoMetodo);
        this.ts.atualizaElementoNaTS(this.METODOID, metd);
    }
    private void metodo109(Token token) throws SemanticError {
        this.ts.retiraVariaveisLocais();
        int nva = this.ts.getNivelAtual() - 1;
        this.ts.setaNivelAtual(nva);
        this.TipoDoMetodo = "";
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo110(Token token) throws SemanticError {
        this.contextoLID = "par-formal";
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo111(Token token) throws SemanticError {
        
        Iterator<Integer> itVar;
        itVar = this.ListaAux.iterator();
        
        ArrayList<Simbolo> novaLista = new ArrayList<>();
        while( itVar.hasNext() )
        {
            Integer nex = itVar.next();
            Simbolo s = this.ts.pegaSimboloDaTSpelaPosicao(nex);
            s.setCategoria("ID-PARAMETRO");
            s.setTipo(this.TipoAtual);
            s.setMPP(this.MPP);
           
            novaLista.add(s);
        }
        
        //pega posição na TS do metodo criado e inseri sua lista de parâmetros
        System.out.println(this.METODOID);
        Simbolo metd = this.ts.pegaSimboloDaTSpelaPosicao(this.METODOID);
        metd.setListaPar(novaLista);
        this.ts.atualizaElementoNaTS(this.METODOID, metd);
        
    }
    private void metodo112(Token token) throws SemanticError {
        this.TipoDoMetodo = this.TipoAtual;
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo113(Token token) throws SemanticError {
        this.TipoDoMetodo = "nulo";
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo114(Token token) throws SemanticError {
        if( this.contextoLID.equals("decl") )
        {
            if ( this.ts.verificaIdDeclarado(token) )
            {
                throw new SemanticError("ID já declarado.", token.getPosition() );
            }
            Simbolo s = new Simbolo( token.getLexeme() );
            
            this.ts.adicionaSimbolo(s);
            int posSimboloAtual = this.ts.getQuantiTotalElements()-1;
            if( this.eh_registro )
            {
                this.ListaReg.add(posSimboloAtual);
            }
            else
            {
                this.ListaVar.add(posSimboloAtual);
            }
        }
        if( this.contextoLID.equals("par-formal") )
        {
            if ( this.ts.verificaIdDeclarado(token) )
            {
                throw new SemanticError("ID de parâmetro repetido.", token.getPosition() );
            }
            Simbolo s = new Simbolo( token.getLexeme() );
            
            this.ts.adicionaSimbolo(s);
            int posSimboloAtual = this.ts.getQuantiTotalElements()-1;
            this.ListaAux.add(posSimboloAtual);
            this.NPF++;
        }
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo115(Token token) {
        this.MPP = "referencia";
    }

    private void metodo116(Token token) {
        this.MPP = "valor";
    }

    private void metodo117(Token token) {
        this.TipoAtual = "inteiro";
    }

    private void metodo118(Token token) {
        this.TipoAtual = "real";
    }

    private void metodo119(Token token) {
        this.TipoAtual = "boobleano";
    }

    private void metodo120(Token token) {
        this.TipoAtual = "caracter";
    }

    private void metodo121(Token token) throws SemanticError {
        if( !this.TipoConst.equals("inteiro") )
        {
            throw new SemanticError("Esperava-se uma consante inteira", token.getPosition() );
        }
        if( Integer.parseInt(token.getLexeme()) > 255 )
        {
            throw new SemanticError("tam. da cadeia > que o permitido", token.getPosition() );
        }
        else
        {
            this.TipoAtual = "cadeia";
        }
    }

    private void metodo122(Token token) throws SemanticError {
        if( this.TipoConst.equals("inteiro") || this.TipoConst.equals("caracter"))
        {
            this.TipoLimiteInferior = this.TipoConst;
            this.ValorLimiteInferior = token.getLexeme();
        }
        else
        {
            throw new SemanticError("Tipo de constante inválido", token.getPosition() );
        }
    }

    private void metodo123(Token token) throws SemanticError {
        if( !this.TipoConst.equals( this.TipoLimiteInferior) )
        {
            throw new SemanticError("Constantes de intervalo diferentes", token.getPosition() );
        }
        else
        {
            int comp = token.getLexeme().compareTo(this.ValorLimiteInferior);  
  
            if(comp <= 0)
            {  
              throw new SemanticError("Lim. Sup. <= Limite Inf.", token.getPosition() );  
            }
            this.TipoLimiteSuperior = this.TipoConst;
            this.ValorLimiteSuperior = token.getLexeme();
            
        }
    }

    private void metodo124(Token token) {
        this.TipoElementos = this.TipoAtual;
        this.TipoAtual = "vetor";
    }

    private void metodo125(Token token) {
        this.eh_registro = true;
    }

    private void metodo126(Token token) {
        this.eh_registro = false;
        this.TipoAtual = "registro";
        this.CategoriaAtual = "ID-VARIAVEL";
    }

    private void metodo127(Token token) throws SemanticError {
        if ( !this.ts.verificaIdDeclarado(token) )
        {
            throw new SemanticError("ID não Declarado.", token.getPosition() );
        }
        Simbolo s = this.ts.retornaSimboloPeloID(token.getLexeme());
        if( s == null )
        {
            throw new SemanticError("erro não esperado regra #127", token.getPosition() );
        }
        if( !s.getCategoria().equals("ID-CONST") )
        {
           throw new SemanticError("Esperava-se um id de constante", token.getPosition() ); 
        }
        else
        {
            this.TipoConst = s.getTipo();
            this.ValCte = s.getValor();
        }
    }

    private void metodo128(Token token) throws SemanticError {
        if( !this.ts.verificaIdDeclarado(token) )
        {
            throw new SemanticError("Identificador não declarado", token.getPosition() );
        }
        else
        {
            int posID = this.ts.retornaPosicaoSimboloPeloID(token.getLexeme());
            if ( posID < 0 )
            {
                throw new SemanticError("Erro não esperado, posição de ID não encontrada", token.getPosition() );
            }
            else
            {
                this.POSID = posID;
            }
        }
    }
    
    private void metodo129(Token token) throws SemanticError
    {
        if( !this.TipoExpr.equals("booleano") && !this.TipoExpr.equals("inteiro") )
        {
            throw new SemanticError("Tipo inválido da expressão", token.getPosition() );
        }
        /**
         * @todo: GERA Código
         */
    }

    private void metodo130(Token token) {
        this.Le_VAR = true;
    }

    private void metodo131(Token token) throws SemanticError {
        this.contextoEXPR = "impressao";
        if( !this.TipoExpr.equals("inteiro") && !this.TipoExpr.equals("real") && !this.TipoExpr.equals("caracter") && !this.TipoExpr.equals("cadeia") )
        {
            throw new SemanticError("Tipo inválido para impressão", token.getPosition() );
        }
        else
        {
            /**
             * @todo: gera código
             */
        }
        
    }

    private void metodo132(Token token) throws SemanticError {
         System.out.println("tipoMetodo "+this.TipoDoMetodo);
          System.out.println("token atual "+token.getLexeme());
          System.out.println("TipoExp "+this.TipoExpr);
        if( this.TipoDoMetodo.equals("") || this.TipoDoMetodo.equals("nulo") )
        {
            throw new SemanticError("'Retorne' só pode ser usado em método com tipo", token.getPosition() );
        }
        
//        Simbolo s = this.ts.retornaSimboloPeloID(token.getLexeme());
//        if( s == null)
//        {
//             throw new SemanticError(" simbolo não existe ERRO NÂO ESPERADO", token.getPosition() );
//        }
//        String tipoExp = s.getTipo();
        String tipoExp = this.TipoExpr;
        if(!tipoExp.equals(this.TipoDoMetodo))
        {
            System.out.println("tipoExpr "+tipoExp);
            System.out.println("tipoMetodo "+this.TipoDoMetodo);
            throw new SemanticError("Tipo da expressão diferente do tipo do método", token.getPosition() );
        }
        /**
         * @todo: Geração de código
         */
    }

    private void metodo133(Token token) throws SemanticError {
        Simbolo s = this.ts.retornaSimboloPeloID(token.getLexeme());
        if( s.getCategoria().equals("ID-VARIAVEL") || s.getCategoria().equals("ID-PARAMETRO"))
        {
            if( s.getTipo().equals("vetor"))
            {
                throw new SemanticError("id deveria ser indexado", token.getPosition() );
            }
            else
            {
                if( s.getTipo().equals("registro"))
                {
                    throw new SemanticError("id deveria ser qualificado", token.getPosition() );  
                } 
                else
                {
                    this.TipoLadoEsq = s.getTipo();
                }
            }
        }
        else
        {
            throw new SemanticError("id deveria ser var ou par", token.getPosition() );
        }
    }
    private void metodo134(Token token) throws SemanticError {
        if( !this.TipoExpr.equals(this.TipoLadoEsq) )
        {
            if(   this.TipoExpr.equals("inteiro") &&  this.TipoLadoEsq.equals("real") )
            {
               System.out.println("tipo exp: "+this.TipoExpr);
               System.out.println("tipo lado esq: "+this.TipoLadoEsq);
               System.out.println("tipo real compativel com tipo inteiro ");
            }
            else
            {
                 if(  this.TipoExpr.equals("caracter") && this.TipoLadoEsq.equals("cadeia") )
                {
                   System.out.println("tipo exp: "+this.TipoExpr);
                   System.out.println("tipo lado esq: "+this.TipoLadoEsq);
                   System.out.println("tipo cadeia compativel com caracter ");
                }
                else
                {
                    System.out.println("tipo exp: "+this.TipoExpr);
                    System.out.println("tipo lado esq: "+this.TipoLadoEsq);
                    throw new SemanticError("Tipos incompatives", token.getPosition());
                }
            }
        }
        else
        {
            //compativeis
            System.out.println(TipoExpr);
            System.out.println(this.TipoLadoEsq);
        }
        /**
         * @todo: geração de código
         */
    }

    private void metodo135(Token token) throws SemanticError {
        
        Simbolo s= this.ts.pegaSimboloDaTSpelaPosicao(this.POSID);
        if( !s.getCategoria().equals("ID-VARIAVEL") )
        {
            throw new SemanticError("esperava-se uma variável", token.getPosition());
        }
        else
        {
            if( !s.getTipo().equals("vetor") && !s.getTipo().equals("cadeia"))
            {
                throw new SemanticError("apenas vetores e cadeias podem ser indexadas", token.getPosition());
            }
            else
            {
                this.TipoVarIndexada = s.getTipo();
            }
        }
        System.out.println("Simbolo em POSID "+s.getNome()+" tipo "+s.getTipo()+" categoria "+s.getCategoria());
        
    }

    private void metodo136(Token token) throws SemanticError {
        if( this.TipoVarIndexada.equals("cadeia"))
        {
            if( !this.TipoExpr.equals("inteiro") )
            {
                throw new SemanticError("índice deveria ser inteiro", token.getPosition());
            }
            else
            {
                this.TipoLadoEsq = "caracter";
            }
        }
        else
        {
            //PEGAR O SIMBOLO E COMPARAR SE TIPOEXP = TIPO DE POSID
            Simbolo s = this.ts.pegaSimboloDaTSpelaPosicao(this.POSID);
            String tipoIndiceVetor = s.getTipoIndiceVetor();
            if( !tipoIndiceVetor.equals(this.TipoExpr) )
            {
                throw new SemanticError("Tipo de índice inválido", token.getPosition());
            }
            else
            {
                //verifica se é indice do vetor
//                String tipoIndVet = s.getTipoIndiceVetor();
//                
//                if( tipoIndVet.equalsIgnoreCase("inteiro"))
//                {
//                    if( ( Integer.parseInt(token.getLexeme()) >= Integer.parseInt( s.getValorLimiteInferior() ) )
//                       && ( Integer.parseInt(token.getLexeme()) <= Integer.parseInt( s.getValorLimiteSuperior() ) ) )
//                    {
//                        
//                    }
//                    else{
//                        throw new SemanticError("Não esta na faixa de indices do vetor", token.getPosition());
//                    }
//                }
//                if( tipoIndVet.equalsIgnoreCase("caracter"))
//                {
//                    
//                }
                this.TipoLadoEsq = s.getTipoElementosVetor();
            }
            System.out.println("tip lado esquerdi "+this.TipoLadoEsq);
            System.out.println(""+token.getLexeme());
            System.out.println(""+this.TipoExpr );
            System.out.println("posid "+this.POSID);
           
            System.out.println(""+s.getTipo());
                /**
                 * @todo implementar esta parte 136
                 */
                    //TipoExpr <> tipo indice do vetor
        }
    }

    private void metodo137(Token token) throws SemanticError {
        System.out.println("cat atual "+this.CategoriaAtual);
        
        Simbolo s = this.ts.retornaSimboloPeloID(token.getLexeme());
        System.out.println("categoria token "+s.getCategoria());
        if( !s.getCategoria().equals("ID-METODO"))
        {
            throw new SemanticError("Id deveria ser um método", token.getPosition());
        }
        else
        {
            if( s.getTipo().equals("nulo"))
            {
               throw new SemanticError("Esperava-se um método com tipo", token.getPosition()); 
            }
        }
    }

    private void metodo138(Token token) {
        if( this.NPA == 1)
        {
            this.contextoEXPR = "par-atual";
            //verifica se existe parametro formal correspondete e se tipo e MPP são compativeis
        }
    }

    private void metodo139(Token token) throws SemanticError {
        if( this.NPA != this.NPF)
        {
            throw new SemanticError("Erro na quantidade de parâmetros");
        }
        else
        {
            /**
             * @todo Gera código
             */
        }
    }

    private void metodo140(Token token) throws SemanticError {
        Simbolo s = this.ts.retornaSimboloPeloID(token.getLexeme());
        if( !s.getCategoria().equals("ID-VARIAVEL"))
        {
            throw new SemanticError("Esperava-se uma variavel",token.getPosition());
        }
        else
        {
            if(!s.getTipo().equals("registro"))
            {
                throw new SemanticError("Apenas registros podem ser qualificados",token.getPosition());
            }
            this.regAtual = this.POSID;
        }
    }

    private void metodo141(Token token) throws SemanticError {
//       
        System.out.println(this.regAtual);
        this.ts.debugTabela();
        Simbolo s = this.ts.pegaSimboloDaTSpelaPosicao(this.regAtual);
        if( s == null )
        {
            throw new SemanticError("Registro inválido", token.getPosition());
        }
        //Iterando sobre a lista de elementos do registro
        ArrayList<Simbolo> listadosRegAtual = new ArrayList<>();
        listadosRegAtual = s.getElementosRegistros();
        s.dedugRegistros();
        Iterator<Simbolo> it = listadosRegAtual.iterator();
        
        String tipoDoId = "";
        boolean encontraCampo = false;
        while( it.hasNext() )
        {
            Simbolo next = it.next();
            next.debugSimbolo();
            if( next.getNome().equals(token.getLexeme()))
            {
                
                System.out.println("0 "+next.getCategoria());
                if( !next.getCategoria().equals("ID-CAMPO-DE-REGISTRO"))
                {
                    throw new SemanticError("esperava-se um campo de registro",token.getPosition());
                }
                tipoDoId = next.getTipo();
                encontraCampo = true;
            }
            
        }
        if( encontraCampo )
        {
            this.TipoLadoEsq = tipoDoId;
        }
        else
        {
            throw new SemanticError("id não é campo de registro atual", token.getPosition());
        }
        
        System.out.println("regAtual: "+this.regAtual);
        // verifica se token faz parte de registro
        
        System.out.println("tipo do campo registro"+tipoDoId);
        System.out.println("tokem "+token.getLexeme());
    }

    private void metodo142(Token token) throws SemanticError {
        Simbolo s = this.ts.retornaSimboloPeloID(token.getLexeme());
        if( !s.getCategoria().equals("ID-METODO"))
        {
            throw new SemanticError("deveria ser um método",token.getPosition());
        }
        else
        {
            if( !s.getTipo().equals("nulo") )
            {
                throw new SemanticError("Esperava-se método sem tipo", token.getPosition());
            }
            else
            {
                if( this.NPF != 0 )
                {
                    throw new SemanticError("Erro na quant. de par.");
                }
                else
                {
                    /**
                     * @todo G código para chamada de método
                     */
                }
            }
        }
    }

    private void metodo143(Token token) throws SemanticError {
        if( this.contextoEXPR.equals("par-atual"))
        {
            this.NPA++;
            //verifica se existe parametro formal correspondente e
            //se o tipo e MPP são compativeis
        }
        if( this.contextoEXPR.equals("impressao"))
        {
           if( this.TipoExpr.equals("booleano"))
           {
               throw new SemanticError("Tipo inválido para impressão",token.getPosition());
           }
           else
           {
               /**
                * @todo Gera código par aimpressão
                */
           }
        }
    }

    private void metodo144(Token token) {
        this.TipoExpr = this.TipoExpSimples;
    }

    private void metodo145(Token token) throws SemanticError {
        if( !this.TipoExpr.equals(this.TipoExpSimples) )
        {
            if( ( this.TipoExpr.equals("real") || this.TipoExpr.equals("inteiro")) && ( this.TipoExpSimples.equals("real") || this.TipoExpSimples.equals("inteiro")))
            {
               System.out.println("tipo exp: "+this.TipoExpr);
               System.out.println("tipo simples: "+this.TipoExpSimples);
               System.out.println("tipo real compativel com tipo inteiro ");
            }
            else
            {
                 if( ( this.TipoExpr.equals("cadeia") || this.TipoExpr.equals("caracter")) && ( this.TipoExpSimples.equals("cadeia") || this.TipoExpSimples.equals("caracter")))
                {
                   System.out.println("tipo exp: "+this.TipoExpr);
                   System.out.println("tipo simples: "+this.TipoExpSimples);
                   System.out.println("tipo cadeia compativel com caracter ");
                }
                else
                {
                    System.out.println("tipo exp: "+this.TipoExpr);
                    System.out.println("tipo simples: "+this.TipoExpSimples);
                    throw new SemanticError("Tipos incompatives", token.getPosition());
                }
            }
        }
    }

    private void metodo146(Token token) {
        this.OP_REL = token.getLexeme();
    }

    private void metodo147(Token token) {
        this.OP_REL = token.getLexeme();
    }

    private void metodo148(Token token) {
        this.OP_REL = token.getLexeme();
    }

    private void metodo149(Token token) {
        this.OP_REL = token.getLexeme();
    }

    private void metodo150(Token token) {
        this.OP_REL = token.getLexeme();
    }

    private void metodo151(Token token) {
        this.OP_REL = token.getLexeme();
    }

    private void metodo152(Token token) {
        this.TipoExpSimples = this.TipoTermo;
    }

    private void metodo153(Token token) {
       
    }

    private void metodo154(Token token) throws SemanticError {
        String tipo = this.TipoTermo;
        /**
         * Verifica se compatibilidade dos dois lados ou não??
         */
        System.out.println("Verifica se compatibilidade dos dois lados ou não??");
        if( !this.TipoTermo.equals(this.TipoExpSimples) )
        {
            if( (  this.TipoTermo.equals("inteiro") &&  this.TipoExpSimples.equals("real") ) ||
                    ( this.TipoTermo.equals("real") &&  this.TipoExpSimples.equals("inteiro") ) 
               )
            {
               tipo = "real";
               System.out.println("tipo real compativel com tipo inteiro ");
            }
            else
            {
                 if( (  this.TipoTermo.equals("caracter") && this.TipoExpSimples.equals("cadeia") ) ||
                     (  this.TipoTermo.equals("cadeia") && this.TipoExpSimples.equals("caracter") )
                    )
                {
                    tipo = "cadeia";
                   System.out.println("tipo cadeia compativel com caracter ");
                }
                else
                {
                    System.out.println("tipo exp: "+this.TipoExpr);
                    System.out.println("tipo lado esq: "+this.TipoLadoEsq);
                    throw new SemanticError("Operadores incompatives", token.getPosition());
                }
            }
        }
        this.TipoExpSimples = tipo;
        /**
         * @todo: geração de código
         */
    }

    private void metodo155(Token token) {
       /**
        * @todo: guarda operador para futura geração de código
        */
    }

    private void metodo156(Token token) {
        /**
        * @todo: guarda operador para futura geração de código
        */
    }

    private void metodo157(Token token) {
        /**
        * @todo: guarda operador para futura geração de código
        */
    }

    private void metodo158(Token token) {
        this.TipoTermo = this.TipoFator;
    }

    private void metodo159(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo160(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo161(Token token) {
        /**
         * @todo: Guarda operador para futura geração de código
         */
    }

    private void metodo162(Token token) {
        /**
         * @todo: Guarda operador para futura geração de código
         */
    }

    private void metodo163(Token token) {
        /**
         * @todo: Guarda operador para futura geração de código
         */
    }

    private void metodo164(Token token) {
        /**
         * @todo: Guarda operador para futura geração de código
         */
    }

    private void metodo165(Token token) throws SemanticError {
        if( !this.TipoFator.equals("booleano"))
        {
            throw new SemanticError("Op. 'nao' exige operando booleano", token.getPosition());
        }
    }

    private void metodo166(Token token) throws SemanticError {
        if( !this.TipoFator.equals("inteiro") && !this.TipoFator.equals("real"))
        {
            throw new SemanticError("Op. unário exige operando numérico", token.getPosition());
        }
    }

    private void metodo167(Token token) {
        this.TipoFator = this.TipoExpr;
    }

    private void metodo168(Token token) {
        this.TipoFator = this.TipoVar;
    }

    private void metodo169(Token token) {
        this.TipoFator = this.TipoConst;
    }

    private void metodo170(Token token) throws SemanticError {
          Simbolo s = this.ts.retornaSimboloPeloID(token.getLexeme());
          if( !s.getCategoria().equals("ID-METODO"))
          {
              throw new SemanticError("id deveria ser um método",token.getPosition());
          }
          else
          {
              if( s.getTipo().equals("nulo") )
              {
                  throw new SemanticError("esp. método com tipo",token.getPosition());
              }
              else
              {
                  if( this.Le_VAR )
                  {
                      throw new SemanticError("só var/par. podem ser lidos",token.getPosition());
                  }
              }
          }
    }

    private void metodo171(Token token) throws SemanticError {
        if( this.NPA == this.NPF )
        {
           // if( TipoVar == tipo do resultado da função então gera código para ativação do método)
        }
        else
        {
            throw new SemanticError("Erro na quantidade de parâmetros", token.getPosition());
        }
    }

    private void metodo172(Token token) throws SemanticError {
        if( this.TipoVarIndexada.equals("cadeia") )
        {
            if(!this.TipoExpr.equals("inteiro"))
            {
                throw new SemanticError("Indice deveria ser inteiro",token.getPosition());
            }
            else
            {
                this.TipoVar = "caracter";
            }
        }
        else
        {
            Simbolo actEle = this.ts.pegaSimboloDaTSpelaPosicao(this.POSID );
            System.out.println("tipo de var array "+actEle.getTipoIndiceVetor());
            System.out.println("Erro em Array de Array IMPLEMENTAR 172"+ token.getLexeme());
            System.out.println(this.POSID);
            
            if( !this.TipoExpr.equals(actEle.getTipoIndiceVetor()) )
            {
                throw new SemanticError("tipo do índice inválido", token.getPosition());
            }
            else
            {
                this.TipoVar = actEle.getTipoElementosVetor();
            }
            
            /*
            se TipoExpr <> tipo do índice do vetor
            então ERRO(“Tipo índice inválido”)
            senao TipoVar := TipoElementos do vetor
            */
        }
        
        if(  this.Le_VAR )
        {
            if( this.TipoVar.equals("booleano"))
            {
                throw new SemanticError("var booleana nao pode ser lida", token.getPosition());
            }
            else
            {
                this.Le_VAR = false;
                /**
                 * @todo: gera cod. para leitura
                 */
            }
        }
    }

    private void metodo173(Token token) throws SemanticError {
        Simbolo regAct = this.ts.pegaSimboloDaTSpelaPosicao(this.regAtual);
        if( regAct == null )
        {
            throw new SemanticError("não existe registro", token.getPosition());
        }
        if( !regAct.getTipo().equals("registro"))
        {
            throw new SemanticError("Não é registro", token.getPosition());
        }
        ArrayList<Simbolo> elementosReg = regAct.getElementosRegistros();
       Simbolo s = this.ts.retornaRegistroPeloID( elementosReg, token.getLexeme() );
        if( s == null)
        {
            throw new SemanticError("id não é campo de reg. Atual", token.getPosition());
        }
          if( !s.getCategoria().equals("ID-CAMPO-DE-REGISTRO"))
          {
              throw new SemanticError("esperava-se um campo de registro", token.getPosition());
          }
          else
          {
              System.out.println(""+s.getTipo()+" "+s.getNome());
              this.TipoVar = s.getTipo();
              //se id é campo do regAtual
              //então TipoVar := Tipo do id
              //senao ERRO (“id não é campo do reg. atual”)
          }
          
          
          if( this.Le_VAR)
          {
              if( this.TipoVar.equals("booleano"))
              {
                  throw new SemanticError("var booleana não pode ser lida", token.getPosition());
              }
              else
              {
                  this.Le_VAR = false;
                  /**
                   * @todo gera cod p/ leitura
                   */
              }
          }
    }

    private void metodo174(Token token) throws SemanticError {
        //pegar dados do simbolo token.getLexeme na tabela de simbolos
        Simbolo atual = this.ts.retornaSimboloPeloID(token.getLexeme());
        if( atual.getCategoria().equals("ID-VARIAVEL") ||  atual.getCategoria().equals("ID-PARAMETRO") )
        {
            if( atual.getTipo().equals("vetor"))
            {
                throw new SemanticError("Vetor deve ser indexado", token.getPosition() );
            }
            else
            {
                if( atual.getTipo().equals("registro"))
                {
                    throw new SemanticError("id deve ser qualificado", token.getPosition() );
                }
                else
                {
                    if( this.Le_VAR )
                    {
                        if(atual.getTipo().equals("booleano"))
                        {
                            throw new SemanticError("bool. não pode ser lido", token.getPosition() );
                        }
                        else
                        {
                            this.Le_VAR = false;
                            /**
                             * @todo: geração de código leitura
                             */
                        }
                    }
                    else
                    {
                        this.TipoVar = atual.getTipo();
                    }
                }
            }
        }
        else
        {
            if( this.Le_VAR )
            {
                throw new SemanticError("Apenas var. e par. podem ser lidas", token.getPosition() );
                
            }
            else
            {
                if( atual.getCategoria().equals("ID-METODO") )
                {
                    if( atual.getTipo().equals("nulo") )
                    {
                        throw new SemanticError("Esp. mét. c/ tipo", token.getPosition() );
                    }
                    else
                    {
                        if(this.NPF != 0)
                        {
                            throw new SemanticError("Erro num. Par.", token.getPosition() );
                        }
                        else
                        {
                            System.out.println("IMPLEMENTAR this.TipoVar = Tipo do resultado ");
                            System.out.println("IMPLEMENTAR this.TipoVar = Tipo do resultado ");
                            System.out.println("IMPLEMENTAR this.TipoVar = Tipo do resultado ");
                            //this.TipoVar = Tipo do resultado;
                            /**
                             * @todo: gera código
                             */
                        }
                    }
                }
                else
                {
                    if( atual.getCategoria().equals("ID-CONST") )
                    {
                        System.out.println(" Verificar se tipo constante atual ou do simbolo ");
                        this.TipoVar = this.TipoConst;
                    }
                    else
                    {
                        throw new SemanticError("esperava-se var, par. método ou constante", token.getPosition() );
                    }
                }
            }
        }
    }

    private void metodo175(Token token) {
          this.TipoConst = "inteiro";
          this.ValCte = token.getLexeme();
    }

    private void metodo176(Token token) {
          this.TipoConst = "real";
          this.ValCte = token.getLexeme();
    }

    private void metodo177(Token token) {
          this.TipoConst = "booleano";
          this.ValCte = token.getLexeme();
    }

    private void metodo178(Token token) {
          this.TipoConst = "booleano";
          this.ValCte = token.getLexeme();
    }

    private void metodo179(Token token) {
        /**
         * @todo gambiarra para caracter? 'a'
         * 
         */
       
        if( token.getLexeme().replace("'","").length() == 1)
        {
           this.TipoConst = "caracter"; 
        }
        else
        {
          this.TipoConst = "literal";
        }
        this.ValCte = token.getLexeme();
    }
}
