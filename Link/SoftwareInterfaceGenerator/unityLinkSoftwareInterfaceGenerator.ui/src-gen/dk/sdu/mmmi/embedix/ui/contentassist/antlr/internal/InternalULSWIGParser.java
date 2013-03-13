package dk.sdu.mmmi.embedix.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.embedix.services.ULSWIGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalULSWIGParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX_NUM", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'READ'", "'WRITE'", "'link'", "';'", "'.'", "'('", "')'", "'{'", "'}'", "','", "':'", "'@'", "'TOSNET'", "'CTRL'", "'='", "'BASE'", "'COMM'", "'+'", "'ID'", "'CRC'", "'PUBLISH'", "'ALL'", "'public'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_HEX_NUM=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalULSWIGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalULSWIGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalULSWIGParser.tokenNames; }
    public String getGrammarFileName() { return "../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g"; }


     
     	private ULSWIGGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ULSWIGGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleLinkSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:60:1: entryRuleLinkSpec : ruleLinkSpec EOF ;
    public final void entryRuleLinkSpec() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:61:1: ( ruleLinkSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:62:1: ruleLinkSpec EOF
            {
             before(grammarAccess.getLinkSpecRule()); 
            pushFollow(FOLLOW_ruleLinkSpec_in_entryRuleLinkSpec61);
            ruleLinkSpec();

            state._fsp--;

             after(grammarAccess.getLinkSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkSpec68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkSpec"


    // $ANTLR start "ruleLinkSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:69:1: ruleLinkSpec : ( ( rule__LinkSpec__Group__0 ) ) ;
    public final void ruleLinkSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:73:2: ( ( ( rule__LinkSpec__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:74:1: ( ( rule__LinkSpec__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:74:1: ( ( rule__LinkSpec__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:75:1: ( rule__LinkSpec__Group__0 )
            {
             before(grammarAccess.getLinkSpecAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:76:1: ( rule__LinkSpec__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:76:2: rule__LinkSpec__Group__0
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__0_in_ruleLinkSpec94);
            rule__LinkSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkSpec"


    // $ANTLR start "entryRuleConstructor"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:88:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:89:1: ( ruleConstructor EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:90:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor121);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:97:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:101:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:102:1: ( ( rule__Constructor__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:102:1: ( ( rule__Constructor__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:103:1: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:104:1: ( rule__Constructor__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:104:2: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0_in_ruleConstructor154);
            rule__Constructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleConstructorAddressParameters"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:116:1: entryRuleConstructorAddressParameters : ruleConstructorAddressParameters EOF ;
    public final void entryRuleConstructorAddressParameters() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:117:1: ( ruleConstructorAddressParameters EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:118:1: ruleConstructorAddressParameters EOF
            {
             before(grammarAccess.getConstructorAddressParametersRule()); 
            pushFollow(FOLLOW_ruleConstructorAddressParameters_in_entryRuleConstructorAddressParameters181);
            ruleConstructorAddressParameters();

            state._fsp--;

             after(grammarAccess.getConstructorAddressParametersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructorAddressParameters188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructorAddressParameters"


    // $ANTLR start "ruleConstructorAddressParameters"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:125:1: ruleConstructorAddressParameters : ( ( rule__ConstructorAddressParameters__Alternatives ) ) ;
    public final void ruleConstructorAddressParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:129:2: ( ( ( rule__ConstructorAddressParameters__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:130:1: ( ( rule__ConstructorAddressParameters__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:130:1: ( ( rule__ConstructorAddressParameters__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:131:1: ( rule__ConstructorAddressParameters__Alternatives )
            {
             before(grammarAccess.getConstructorAddressParametersAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:132:1: ( rule__ConstructorAddressParameters__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:132:2: rule__ConstructorAddressParameters__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstructorAddressParameters__Alternatives_in_ruleConstructorAddressParameters214);
            rule__ConstructorAddressParameters__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAddressParametersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructorAddressParameters"


    // $ANTLR start "entryRuleNamedAddresses"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:144:1: entryRuleNamedAddresses : ruleNamedAddresses EOF ;
    public final void entryRuleNamedAddresses() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:145:1: ( ruleNamedAddresses EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:146:1: ruleNamedAddresses EOF
            {
             before(grammarAccess.getNamedAddressesRule()); 
            pushFollow(FOLLOW_ruleNamedAddresses_in_entryRuleNamedAddresses241);
            ruleNamedAddresses();

            state._fsp--;

             after(grammarAccess.getNamedAddressesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddresses248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedAddresses"


    // $ANTLR start "ruleNamedAddresses"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:153:1: ruleNamedAddresses : ( ( rule__NamedAddresses__Group__0 ) ) ;
    public final void ruleNamedAddresses() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:157:2: ( ( ( rule__NamedAddresses__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:158:1: ( ( rule__NamedAddresses__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:158:1: ( ( rule__NamedAddresses__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:159:1: ( rule__NamedAddresses__Group__0 )
            {
             before(grammarAccess.getNamedAddressesAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:160:1: ( rule__NamedAddresses__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:160:2: rule__NamedAddresses__Group__0
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group__0_in_ruleNamedAddresses274);
            rule__NamedAddresses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedAddressesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedAddresses"


    // $ANTLR start "entryRuleAddressTuple"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:172:1: entryRuleAddressTuple : ruleAddressTuple EOF ;
    public final void entryRuleAddressTuple() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:173:1: ( ruleAddressTuple EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:174:1: ruleAddressTuple EOF
            {
             before(grammarAccess.getAddressTupleRule()); 
            pushFollow(FOLLOW_ruleAddressTuple_in_entryRuleAddressTuple301);
            ruleAddressTuple();

            state._fsp--;

             after(grammarAccess.getAddressTupleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressTuple308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressTuple"


    // $ANTLR start "ruleAddressTuple"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:181:1: ruleAddressTuple : ( ( rule__AddressTuple__Group__0 ) ) ;
    public final void ruleAddressTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:185:2: ( ( ( rule__AddressTuple__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:186:1: ( ( rule__AddressTuple__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:186:1: ( ( rule__AddressTuple__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:187:1: ( rule__AddressTuple__Group__0 )
            {
             before(grammarAccess.getAddressTupleAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:188:1: ( rule__AddressTuple__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:188:2: rule__AddressTuple__Group__0
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__0_in_ruleAddressTuple334);
            rule__AddressTuple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressTupleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressTuple"


    // $ANTLR start "entryRuleMember"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:200:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:201:1: ( ruleMember EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:202:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember361);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:209:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:213:2: ( ( ( rule__Member__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:214:1: ( ( rule__Member__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:214:1: ( ( rule__Member__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:215:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:216:1: ( rule__Member__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:216:2: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_rule__Member__Alternatives_in_ruleMember394);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:228:1: entryRuleLinkBinding : ruleLinkBinding EOF ;
    public final void entryRuleLinkBinding() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:229:1: ( ruleLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:230:1: ruleLinkBinding EOF
            {
             before(grammarAccess.getLinkBindingRule()); 
            pushFollow(FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding421);
            ruleLinkBinding();

            state._fsp--;

             after(grammarAccess.getLinkBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkBinding428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkBinding"


    // $ANTLR start "ruleLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:237:1: ruleLinkBinding : ( ruleTosNetLinkBinding ) ;
    public final void ruleLinkBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:241:2: ( ( ruleTosNetLinkBinding ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:242:1: ( ruleTosNetLinkBinding )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:242:1: ( ruleTosNetLinkBinding )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:243:1: ruleTosNetLinkBinding
            {
             before(grammarAccess.getLinkBindingAccess().getTosNetLinkBindingParserRuleCall()); 
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding454);
            ruleTosNetLinkBinding();

            state._fsp--;

             after(grammarAccess.getLinkBindingAccess().getTosNetLinkBindingParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkBinding"


    // $ANTLR start "entryRuleTosNetLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:256:1: entryRuleTosNetLinkBinding : ruleTosNetLinkBinding EOF ;
    public final void entryRuleTosNetLinkBinding() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:257:1: ( ruleTosNetLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:258:1: ruleTosNetLinkBinding EOF
            {
             before(grammarAccess.getTosNetLinkBindingRule()); 
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding480);
            ruleTosNetLinkBinding();

            state._fsp--;

             after(grammarAccess.getTosNetLinkBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTosNetLinkBinding487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTosNetLinkBinding"


    // $ANTLR start "ruleTosNetLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:265:1: ruleTosNetLinkBinding : ( ( rule__TosNetLinkBinding__Group__0 ) ) ;
    public final void ruleTosNetLinkBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:269:2: ( ( ( rule__TosNetLinkBinding__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:270:1: ( ( rule__TosNetLinkBinding__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:270:1: ( ( rule__TosNetLinkBinding__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:271:1: ( rule__TosNetLinkBinding__Group__0 )
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:272:1: ( rule__TosNetLinkBinding__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:272:2: rule__TosNetLinkBinding__Group__0
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__0_in_ruleTosNetLinkBinding513);
            rule__TosNetLinkBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTosNetLinkBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTosNetLinkBinding"


    // $ANTLR start "entryRuleLinkProperty"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:284:1: entryRuleLinkProperty : ruleLinkProperty EOF ;
    public final void entryRuleLinkProperty() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:285:1: ( ruleLinkProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:286:1: ruleLinkProperty EOF
            {
             before(grammarAccess.getLinkPropertyRule()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty540);
            ruleLinkProperty();

            state._fsp--;

             after(grammarAccess.getLinkPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkProperty547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkProperty"


    // $ANTLR start "ruleLinkProperty"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:293:1: ruleLinkProperty : ( ( rule__LinkProperty__Alternatives ) ) ;
    public final void ruleLinkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:297:2: ( ( ( rule__LinkProperty__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:298:1: ( ( rule__LinkProperty__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:298:1: ( ( rule__LinkProperty__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:299:1: ( rule__LinkProperty__Alternatives )
            {
             before(grammarAccess.getLinkPropertyAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:300:1: ( rule__LinkProperty__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:300:2: rule__LinkProperty__Alternatives
            {
            pushFollow(FOLLOW_rule__LinkProperty__Alternatives_in_ruleLinkProperty573);
            rule__LinkProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinkPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkProperty"


    // $ANTLR start "entryRuleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:312:1: entryRuleExpansion : ruleExpansion EOF ;
    public final void entryRuleExpansion() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:313:1: ( ruleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:314:1: ruleExpansion EOF
            {
             before(grammarAccess.getExpansionRule()); 
            pushFollow(FOLLOW_ruleExpansion_in_entryRuleExpansion600);
            ruleExpansion();

            state._fsp--;

             after(grammarAccess.getExpansionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpansion607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpansion"


    // $ANTLR start "ruleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:321:1: ruleExpansion : ( ( rule__Expansion__Alternatives ) ) ;
    public final void ruleExpansion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:325:2: ( ( ( rule__Expansion__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:326:1: ( ( rule__Expansion__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:326:1: ( ( rule__Expansion__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:327:1: ( rule__Expansion__Alternatives )
            {
             before(grammarAccess.getExpansionAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:328:1: ( rule__Expansion__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:328:2: rule__Expansion__Alternatives
            {
            pushFollow(FOLLOW_rule__Expansion__Alternatives_in_ruleExpansion633);
            rule__Expansion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpansionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpansion"


    // $ANTLR start "entryRuleSimpleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:340:1: entryRuleSimpleExpansion : ruleSimpleExpansion EOF ;
    public final void entryRuleSimpleExpansion() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:341:1: ( ruleSimpleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:342:1: ruleSimpleExpansion EOF
            {
             before(grammarAccess.getSimpleExpansionRule()); 
            pushFollow(FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion660);
            ruleSimpleExpansion();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpansion667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleExpansion"


    // $ANTLR start "ruleSimpleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:349:1: ruleSimpleExpansion : ( ( rule__SimpleExpansion__Group__0 ) ) ;
    public final void ruleSimpleExpansion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:353:2: ( ( ( rule__SimpleExpansion__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:354:1: ( ( rule__SimpleExpansion__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:354:1: ( ( rule__SimpleExpansion__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:355:1: ( rule__SimpleExpansion__Group__0 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:356:1: ( rule__SimpleExpansion__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:356:2: rule__SimpleExpansion__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__0_in_ruleSimpleExpansion693);
            rule__SimpleExpansion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleExpansion"


    // $ANTLR start "entryRuleAddressExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:368:1: entryRuleAddressExpansion : ruleAddressExpansion EOF ;
    public final void entryRuleAddressExpansion() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:369:1: ( ruleAddressExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:370:1: ruleAddressExpansion EOF
            {
             before(grammarAccess.getAddressExpansionRule()); 
            pushFollow(FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion720);
            ruleAddressExpansion();

            state._fsp--;

             after(grammarAccess.getAddressExpansionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressExpansion727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressExpansion"


    // $ANTLR start "ruleAddressExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:377:1: ruleAddressExpansion : ( ( rule__AddressExpansion__Group__0 ) ) ;
    public final void ruleAddressExpansion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:381:2: ( ( ( rule__AddressExpansion__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:382:1: ( ( rule__AddressExpansion__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:382:1: ( ( rule__AddressExpansion__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:383:1: ( rule__AddressExpansion__Group__0 )
            {
             before(grammarAccess.getAddressExpansionAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:384:1: ( rule__AddressExpansion__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:384:2: rule__AddressExpansion__Group__0
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__0_in_ruleAddressExpansion753);
            rule__AddressExpansion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressExpansion"


    // $ANTLR start "entryRuleArgument"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:396:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:397:1: ( ruleArgument EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:398:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument780);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:405:1: ruleArgument : ( ( rule__Argument__Alternatives ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:409:2: ( ( ( rule__Argument__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:410:1: ( ( rule__Argument__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:410:1: ( ( rule__Argument__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:411:1: ( rule__Argument__Alternatives )
            {
             before(grammarAccess.getArgumentAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:412:1: ( rule__Argument__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:412:2: rule__Argument__Alternatives
            {
            pushFollow(FOLLOW_rule__Argument__Alternatives_in_ruleArgument813);
            rule__Argument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAddressBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:424:1: entryRuleAddressBinding : ruleAddressBinding EOF ;
    public final void entryRuleAddressBinding() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:425:1: ( ruleAddressBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:426:1: ruleAddressBinding EOF
            {
             before(grammarAccess.getAddressBindingRule()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding840);
            ruleAddressBinding();

            state._fsp--;

             after(grammarAccess.getAddressBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressBinding847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressBinding"


    // $ANTLR start "ruleAddressBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:433:1: ruleAddressBinding : ( ( rule__AddressBinding__Group__0 ) ) ;
    public final void ruleAddressBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:437:2: ( ( ( rule__AddressBinding__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:438:1: ( ( rule__AddressBinding__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:438:1: ( ( rule__AddressBinding__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:439:1: ( rule__AddressBinding__Group__0 )
            {
             before(grammarAccess.getAddressBindingAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:440:1: ( rule__AddressBinding__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:440:2: rule__AddressBinding__Group__0
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__0_in_ruleAddressBinding873);
            rule__AddressBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressBinding"


    // $ANTLR start "entryRuleInstantiation"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:452:1: entryRuleInstantiation : ruleInstantiation EOF ;
    public final void entryRuleInstantiation() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:453:1: ( ruleInstantiation EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:454:1: ruleInstantiation EOF
            {
             before(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_ruleInstantiation_in_entryRuleInstantiation900);
            ruleInstantiation();

            state._fsp--;

             after(grammarAccess.getInstantiationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiation907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstantiation"


    // $ANTLR start "ruleInstantiation"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:461:1: ruleInstantiation : ( ( rule__Instantiation__Group__0 ) ) ;
    public final void ruleInstantiation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:465:2: ( ( ( rule__Instantiation__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:466:1: ( ( rule__Instantiation__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:466:1: ( ( rule__Instantiation__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:467:1: ( rule__Instantiation__Group__0 )
            {
             before(grammarAccess.getInstantiationAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:468:1: ( rule__Instantiation__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:468:2: rule__Instantiation__Group__0
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__0_in_ruleInstantiation933);
            rule__Instantiation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstantiation"


    // $ANTLR start "entryRuleAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:480:1: entryRuleAddressSpec : ruleAddressSpec EOF ;
    public final void entryRuleAddressSpec() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:481:1: ( ruleAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:482:1: ruleAddressSpec EOF
            {
             before(grammarAccess.getAddressSpecRule()); 
            pushFollow(FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec960);
            ruleAddressSpec();

            state._fsp--;

             after(grammarAccess.getAddressSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressSpec967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressSpec"


    // $ANTLR start "ruleAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:489:1: ruleAddressSpec : ( ( rule__AddressSpec__Alternatives ) ) ;
    public final void ruleAddressSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:493:2: ( ( ( rule__AddressSpec__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:494:1: ( ( rule__AddressSpec__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:494:1: ( ( rule__AddressSpec__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:495:1: ( rule__AddressSpec__Alternatives )
            {
             before(grammarAccess.getAddressSpecAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:496:1: ( rule__AddressSpec__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:496:2: rule__AddressSpec__Alternatives
            {
            pushFollow(FOLLOW_rule__AddressSpec__Alternatives_in_ruleAddressSpec993);
            rule__AddressSpec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddressSpecAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressSpec"


    // $ANTLR start "entryRuleDirectAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:508:1: entryRuleDirectAddressSpec : ruleDirectAddressSpec EOF ;
    public final void entryRuleDirectAddressSpec() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:509:1: ( ruleDirectAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:510:1: ruleDirectAddressSpec EOF
            {
             before(grammarAccess.getDirectAddressSpecRule()); 
            pushFollow(FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec1020);
            ruleDirectAddressSpec();

            state._fsp--;

             after(grammarAccess.getDirectAddressSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectAddressSpec1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectAddressSpec"


    // $ANTLR start "ruleDirectAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:517:1: ruleDirectAddressSpec : ( ( rule__DirectAddressSpec__Group__0 ) ) ;
    public final void ruleDirectAddressSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:521:2: ( ( ( rule__DirectAddressSpec__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:522:1: ( ( rule__DirectAddressSpec__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:522:1: ( ( rule__DirectAddressSpec__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:523:1: ( rule__DirectAddressSpec__Group__0 )
            {
             before(grammarAccess.getDirectAddressSpecAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:524:1: ( rule__DirectAddressSpec__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:524:2: rule__DirectAddressSpec__Group__0
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__0_in_ruleDirectAddressSpec1053);
            rule__DirectAddressSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectAddressSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectAddressSpec"


    // $ANTLR start "entryRuleNamedAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:536:1: entryRuleNamedAddressSpec : ruleNamedAddressSpec EOF ;
    public final void entryRuleNamedAddressSpec() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:537:1: ( ruleNamedAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:538:1: ruleNamedAddressSpec EOF
            {
             before(grammarAccess.getNamedAddressSpecRule()); 
            pushFollow(FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec1080);
            ruleNamedAddressSpec();

            state._fsp--;

             after(grammarAccess.getNamedAddressSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddressSpec1087); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedAddressSpec"


    // $ANTLR start "ruleNamedAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:545:1: ruleNamedAddressSpec : ( ( rule__NamedAddressSpec__NameAssignment ) ) ;
    public final void ruleNamedAddressSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:549:2: ( ( ( rule__NamedAddressSpec__NameAssignment ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:550:1: ( ( rule__NamedAddressSpec__NameAssignment ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:550:1: ( ( rule__NamedAddressSpec__NameAssignment ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:551:1: ( rule__NamedAddressSpec__NameAssignment )
            {
             before(grammarAccess.getNamedAddressSpecAccess().getNameAssignment()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:552:1: ( rule__NamedAddressSpec__NameAssignment )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:552:2: rule__NamedAddressSpec__NameAssignment
            {
            pushFollow(FOLLOW_rule__NamedAddressSpec__NameAssignment_in_ruleNamedAddressSpec1113);
            rule__NamedAddressSpec__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNamedAddressSpecAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedAddressSpec"


    // $ANTLR start "entryRuleKind"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:564:1: entryRuleKind : ruleKind EOF ;
    public final void entryRuleKind() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:565:1: ( ruleKind EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:566:1: ruleKind EOF
            {
             before(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_ruleKind_in_entryRuleKind1140);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getKindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKind1147); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:573:1: ruleKind : ( ( rule__Kind__Alternatives ) ) ;
    public final void ruleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:577:2: ( ( ( rule__Kind__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:578:1: ( ( rule__Kind__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:578:1: ( ( rule__Kind__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:579:1: ( rule__Kind__Alternatives )
            {
             before(grammarAccess.getKindAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:580:1: ( rule__Kind__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:580:2: rule__Kind__Alternatives
            {
            pushFollow(FOLLOW_rule__Kind__Alternatives_in_ruleKind1173);
            rule__Kind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleInstantiationProperty"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:592:1: entryRuleInstantiationProperty : ruleInstantiationProperty EOF ;
    public final void entryRuleInstantiationProperty() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:593:1: ( ruleInstantiationProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:594:1: ruleInstantiationProperty EOF
            {
             before(grammarAccess.getInstantiationPropertyRule()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty1200);
            ruleInstantiationProperty();

            state._fsp--;

             after(grammarAccess.getInstantiationPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationProperty1207); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstantiationProperty"


    // $ANTLR start "ruleInstantiationProperty"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:601:1: ruleInstantiationProperty : ( ( rule__InstantiationProperty__Alternatives ) ) ;
    public final void ruleInstantiationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:605:2: ( ( ( rule__InstantiationProperty__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:606:1: ( ( rule__InstantiationProperty__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:606:1: ( ( rule__InstantiationProperty__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:607:1: ( rule__InstantiationProperty__Alternatives )
            {
             before(grammarAccess.getInstantiationPropertyAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:608:1: ( rule__InstantiationProperty__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:608:2: rule__InstantiationProperty__Alternatives
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Alternatives_in_ruleInstantiationProperty1233);
            rule__InstantiationProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstantiationProperty"


    // $ANTLR start "entryRuleGrouping"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:620:1: entryRuleGrouping : ruleGrouping EOF ;
    public final void entryRuleGrouping() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:621:1: ( ruleGrouping EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:622:1: ruleGrouping EOF
            {
             before(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping1260);
            ruleGrouping();

            state._fsp--;

             after(grammarAccess.getGroupingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping1267); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrouping"


    // $ANTLR start "ruleGrouping"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:629:1: ruleGrouping : ( ( rule__Grouping__Group__0 ) ) ;
    public final void ruleGrouping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:633:2: ( ( ( rule__Grouping__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:634:1: ( ( rule__Grouping__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:634:1: ( ( rule__Grouping__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:635:1: ( rule__Grouping__Group__0 )
            {
             before(grammarAccess.getGroupingAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:636:1: ( rule__Grouping__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:636:2: rule__Grouping__Group__0
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1293);
            rule__Grouping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrouping"


    // $ANTLR start "entryRuleGroupElement"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:648:1: entryRuleGroupElement : ruleGroupElement EOF ;
    public final void entryRuleGroupElement() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:649:1: ( ruleGroupElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:650:1: ruleGroupElement EOF
            {
             before(grammarAccess.getGroupElementRule()); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement1320);
            ruleGroupElement();

            state._fsp--;

             after(grammarAccess.getGroupElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement1327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupElement"


    // $ANTLR start "ruleGroupElement"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:657:1: ruleGroupElement : ( ( rule__GroupElement__Group__0 ) ) ;
    public final void ruleGroupElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:661:2: ( ( ( rule__GroupElement__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:662:1: ( ( rule__GroupElement__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:662:1: ( ( rule__GroupElement__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:663:1: ( rule__GroupElement__Group__0 )
            {
             before(grammarAccess.getGroupElementAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:664:1: ( rule__GroupElement__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:664:2: rule__GroupElement__Group__0
            {
            pushFollow(FOLLOW_rule__GroupElement__Group__0_in_ruleGroupElement1353);
            rule__GroupElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupElement"


    // $ANTLR start "entryRulePathElement"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:676:1: entryRulePathElement : rulePathElement EOF ;
    public final void entryRulePathElement() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:677:1: ( rulePathElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:678:1: rulePathElement EOF
            {
             before(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement1380);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getPathElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement1387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:685:1: rulePathElement : ( ( rule__PathElement__Alternatives ) ) ;
    public final void rulePathElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:689:2: ( ( ( rule__PathElement__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:690:1: ( ( rule__PathElement__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:690:1: ( ( rule__PathElement__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:691:1: ( rule__PathElement__Alternatives )
            {
             before(grammarAccess.getPathElementAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:692:1: ( rule__PathElement__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:692:2: rule__PathElement__Alternatives
            {
            pushFollow(FOLLOW_rule__PathElement__Alternatives_in_rulePathElement1413);
            rule__PathElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPathElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathElement"


    // $ANTLR start "rule__ConstructorAddressParameters__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:704:1: rule__ConstructorAddressParameters__Alternatives : ( ( ruleNamedAddresses ) | ( ruleAddressTuple ) );
    public final void rule__ConstructorAddressParameters__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:708:1: ( ( ruleNamedAddresses ) | ( ruleAddressTuple ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    alt1=1;
                }
                else if ( (LA1_1==17) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:709:1: ( ruleNamedAddresses )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:709:1: ( ruleNamedAddresses )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:710:1: ruleNamedAddresses
                    {
                     before(grammarAccess.getConstructorAddressParametersAccess().getNamedAddressesParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNamedAddresses_in_rule__ConstructorAddressParameters__Alternatives1449);
                    ruleNamedAddresses();

                    state._fsp--;

                     after(grammarAccess.getConstructorAddressParametersAccess().getNamedAddressesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:715:6: ( ruleAddressTuple )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:715:6: ( ruleAddressTuple )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:716:1: ruleAddressTuple
                    {
                     before(grammarAccess.getConstructorAddressParametersAccess().getAddressTupleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAddressTuple_in_rule__ConstructorAddressParameters__Alternatives1466);
                    ruleAddressTuple();

                    state._fsp--;

                     after(grammarAccess.getConstructorAddressParametersAccess().getAddressTupleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructorAddressParameters__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:726:1: rule__Member__Alternatives : ( ( ruleLinkBinding ) | ( ruleExpansion ) | ( ruleInstantiation ) | ( ruleGrouping ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:730:1: ( ( ruleLinkBinding ) | ( ruleExpansion ) | ( ruleInstantiation ) | ( ruleGrouping ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==26) ) {
                    alt2=4;
                }
                else if ( (LA2_2==22) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_ID) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==22) ) {
                        int LA2_7 = input.LA(4);

                        if ( ((LA2_7>=12 && LA2_7<=13)) ) {
                            alt2=3;
                        }
                        else if ( (LA2_7==RULE_ID) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_6==26) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:731:1: ( ruleLinkBinding )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:731:1: ( ruleLinkBinding )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:732:1: ruleLinkBinding
                    {
                     before(grammarAccess.getMemberAccess().getLinkBindingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLinkBinding_in_rule__Member__Alternatives1498);
                    ruleLinkBinding();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getLinkBindingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:737:6: ( ruleExpansion )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:737:6: ( ruleExpansion )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:738:1: ruleExpansion
                    {
                     before(grammarAccess.getMemberAccess().getExpansionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpansion_in_rule__Member__Alternatives1515);
                    ruleExpansion();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getExpansionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:743:6: ( ruleInstantiation )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:743:6: ( ruleInstantiation )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:744:1: ruleInstantiation
                    {
                     before(grammarAccess.getMemberAccess().getInstantiationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInstantiation_in_rule__Member__Alternatives1532);
                    ruleInstantiation();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getInstantiationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:749:6: ( ruleGrouping )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:749:6: ( ruleGrouping )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:750:1: ruleGrouping
                    {
                     before(grammarAccess.getMemberAccess().getGroupingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGrouping_in_rule__Member__Alternatives1549);
                    ruleGrouping();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getGroupingParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__LinkProperty__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:760:1: rule__LinkProperty__Alternatives : ( ( ( rule__LinkProperty__Group_0__0 ) ) | ( ( rule__LinkProperty__Group_1__0 ) ) | ( ( rule__LinkProperty__Group_2__0 ) ) );
    public final void rule__LinkProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:764:1: ( ( ( rule__LinkProperty__Group_0__0 ) ) | ( ( rule__LinkProperty__Group_1__0 ) ) | ( ( rule__LinkProperty__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:765:1: ( ( rule__LinkProperty__Group_0__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:765:1: ( ( rule__LinkProperty__Group_0__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:766:1: ( rule__LinkProperty__Group_0__0 )
                    {
                     before(grammarAccess.getLinkPropertyAccess().getGroup_0()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:767:1: ( rule__LinkProperty__Group_0__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:767:2: rule__LinkProperty__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__LinkProperty__Group_0__0_in_rule__LinkProperty__Alternatives1581);
                    rule__LinkProperty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkPropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:771:6: ( ( rule__LinkProperty__Group_1__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:771:6: ( ( rule__LinkProperty__Group_1__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:772:1: ( rule__LinkProperty__Group_1__0 )
                    {
                     before(grammarAccess.getLinkPropertyAccess().getGroup_1()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:773:1: ( rule__LinkProperty__Group_1__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:773:2: rule__LinkProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LinkProperty__Group_1__0_in_rule__LinkProperty__Alternatives1599);
                    rule__LinkProperty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkPropertyAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:777:6: ( ( rule__LinkProperty__Group_2__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:777:6: ( ( rule__LinkProperty__Group_2__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:778:1: ( rule__LinkProperty__Group_2__0 )
                    {
                     before(grammarAccess.getLinkPropertyAccess().getGroup_2()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:779:1: ( rule__LinkProperty__Group_2__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:779:2: rule__LinkProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__LinkProperty__Group_2__0_in_rule__LinkProperty__Alternatives1617);
                    rule__LinkProperty__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkPropertyAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Alternatives"


    // $ANTLR start "rule__Expansion__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:788:1: rule__Expansion__Alternatives : ( ( ruleSimpleExpansion ) | ( ruleAddressExpansion ) );
    public final void rule__Expansion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:792:1: ( ( ruleSimpleExpansion ) | ( ruleAddressExpansion ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:793:1: ( ruleSimpleExpansion )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:793:1: ( ruleSimpleExpansion )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:794:1: ruleSimpleExpansion
                    {
                     before(grammarAccess.getExpansionAccess().getSimpleExpansionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleExpansion_in_rule__Expansion__Alternatives1650);
                    ruleSimpleExpansion();

                    state._fsp--;

                     after(grammarAccess.getExpansionAccess().getSimpleExpansionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:799:6: ( ruleAddressExpansion )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:799:6: ( ruleAddressExpansion )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:800:1: ruleAddressExpansion
                    {
                     before(grammarAccess.getExpansionAccess().getAddressExpansionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAddressExpansion_in_rule__Expansion__Alternatives1667);
                    ruleAddressExpansion();

                    state._fsp--;

                     after(grammarAccess.getExpansionAccess().getAddressExpansionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expansion__Alternatives"


    // $ANTLR start "rule__Argument__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:810:1: rule__Argument__Alternatives : ( ( ( rule__Argument__SimpleAssignment_0 ) ) | ( ( rule__Argument__Group_1__0 ) ) | ( ( rule__Argument__TextAssignment_2 ) ) );
    public final void rule__Argument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:814:1: ( ( ( rule__Argument__SimpleAssignment_0 ) ) | ( ( rule__Argument__Group_1__0 ) ) | ( ( rule__Argument__TextAssignment_2 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==29) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==18||LA5_1==21) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:815:1: ( ( rule__Argument__SimpleAssignment_0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:815:1: ( ( rule__Argument__SimpleAssignment_0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:816:1: ( rule__Argument__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getArgumentAccess().getSimpleAssignment_0()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:817:1: ( rule__Argument__SimpleAssignment_0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:817:2: rule__Argument__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Argument__SimpleAssignment_0_in_rule__Argument__Alternatives1699);
                    rule__Argument__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArgumentAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:821:6: ( ( rule__Argument__Group_1__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:821:6: ( ( rule__Argument__Group_1__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:822:1: ( rule__Argument__Group_1__0 )
                    {
                     before(grammarAccess.getArgumentAccess().getGroup_1()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:823:1: ( rule__Argument__Group_1__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:823:2: rule__Argument__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_1__0_in_rule__Argument__Alternatives1717);
                    rule__Argument__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArgumentAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:827:6: ( ( rule__Argument__TextAssignment_2 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:827:6: ( ( rule__Argument__TextAssignment_2 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:828:1: ( rule__Argument__TextAssignment_2 )
                    {
                     before(grammarAccess.getArgumentAccess().getTextAssignment_2()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:829:1: ( rule__Argument__TextAssignment_2 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:829:2: rule__Argument__TextAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Argument__TextAssignment_2_in_rule__Argument__Alternatives1735);
                    rule__Argument__TextAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getArgumentAccess().getTextAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Alternatives"


    // $ANTLR start "rule__AddressSpec__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:838:1: rule__AddressSpec__Alternatives : ( ( ruleDirectAddressSpec ) | ( ruleNamedAddressSpec ) );
    public final void rule__AddressSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:842:1: ( ( ruleDirectAddressSpec ) | ( ruleNamedAddressSpec ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==26) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==22) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:843:1: ( ruleDirectAddressSpec )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:843:1: ( ruleDirectAddressSpec )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:844:1: ruleDirectAddressSpec
                    {
                     before(grammarAccess.getAddressSpecAccess().getDirectAddressSpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDirectAddressSpec_in_rule__AddressSpec__Alternatives1768);
                    ruleDirectAddressSpec();

                    state._fsp--;

                     after(grammarAccess.getAddressSpecAccess().getDirectAddressSpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:849:6: ( ruleNamedAddressSpec )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:849:6: ( ruleNamedAddressSpec )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:850:1: ruleNamedAddressSpec
                    {
                     before(grammarAccess.getAddressSpecAccess().getNamedAddressSpecParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNamedAddressSpec_in_rule__AddressSpec__Alternatives1785);
                    ruleNamedAddressSpec();

                    state._fsp--;

                     after(grammarAccess.getAddressSpecAccess().getNamedAddressSpecParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressSpec__Alternatives"


    // $ANTLR start "rule__Kind__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:860:1: rule__Kind__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) );
    public final void rule__Kind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:864:1: ( ( 'READ' ) | ( 'WRITE' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:865:1: ( 'READ' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:865:1: ( 'READ' )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:866:1: 'READ'
                    {
                     before(grammarAccess.getKindAccess().getREADKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Kind__Alternatives1818); 
                     after(grammarAccess.getKindAccess().getREADKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:873:6: ( 'WRITE' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:873:6: ( 'WRITE' )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:874:1: 'WRITE'
                    {
                     before(grammarAccess.getKindAccess().getWRITEKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Kind__Alternatives1838); 
                     after(grammarAccess.getKindAccess().getWRITEKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Alternatives"


    // $ANTLR start "rule__InstantiationProperty__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:886:1: rule__InstantiationProperty__Alternatives : ( ( ( rule__InstantiationProperty__Group_0__0 ) ) | ( ( rule__InstantiationProperty__Group_1__0 ) ) | ( ( rule__InstantiationProperty__Group_2__0 ) ) );
    public final void rule__InstantiationProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:890:1: ( ( ( rule__InstantiationProperty__Group_0__0 ) ) | ( ( rule__InstantiationProperty__Group_1__0 ) ) | ( ( rule__InstantiationProperty__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:891:1: ( ( rule__InstantiationProperty__Group_0__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:891:1: ( ( rule__InstantiationProperty__Group_0__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:892:1: ( rule__InstantiationProperty__Group_0__0 )
                    {
                     before(grammarAccess.getInstantiationPropertyAccess().getGroup_0()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:893:1: ( rule__InstantiationProperty__Group_0__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:893:2: rule__InstantiationProperty__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__0_in_rule__InstantiationProperty__Alternatives1872);
                    rule__InstantiationProperty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstantiationPropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:897:6: ( ( rule__InstantiationProperty__Group_1__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:897:6: ( ( rule__InstantiationProperty__Group_1__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:898:1: ( rule__InstantiationProperty__Group_1__0 )
                    {
                     before(grammarAccess.getInstantiationPropertyAccess().getGroup_1()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:899:1: ( rule__InstantiationProperty__Group_1__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:899:2: rule__InstantiationProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InstantiationProperty__Group_1__0_in_rule__InstantiationProperty__Alternatives1890);
                    rule__InstantiationProperty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstantiationPropertyAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:903:6: ( ( rule__InstantiationProperty__Group_2__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:903:6: ( ( rule__InstantiationProperty__Group_2__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:904:1: ( rule__InstantiationProperty__Group_2__0 )
                    {
                     before(grammarAccess.getInstantiationPropertyAccess().getGroup_2()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:905:1: ( rule__InstantiationProperty__Group_2__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:905:2: rule__InstantiationProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__0_in_rule__InstantiationProperty__Alternatives1908);
                    rule__InstantiationProperty__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstantiationPropertyAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Alternatives"


    // $ANTLR start "rule__PathElement__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:914:1: rule__PathElement__Alternatives : ( ( ( rule__PathElement__SimpleAssignment_0 ) ) | ( ( rule__PathElement__Group_1__0 ) ) );
    public final void rule__PathElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:918:1: ( ( ( rule__PathElement__SimpleAssignment_0 ) ) | ( ( rule__PathElement__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:919:1: ( ( rule__PathElement__SimpleAssignment_0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:919:1: ( ( rule__PathElement__SimpleAssignment_0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:920:1: ( rule__PathElement__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getPathElementAccess().getSimpleAssignment_0()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:921:1: ( rule__PathElement__SimpleAssignment_0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:921:2: rule__PathElement__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PathElement__SimpleAssignment_0_in_rule__PathElement__Alternatives1941);
                    rule__PathElement__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathElementAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:925:6: ( ( rule__PathElement__Group_1__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:925:6: ( ( rule__PathElement__Group_1__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:926:1: ( rule__PathElement__Group_1__0 )
                    {
                     before(grammarAccess.getPathElementAccess().getGroup_1()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:927:1: ( rule__PathElement__Group_1__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:927:2: rule__PathElement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PathElement__Group_1__0_in_rule__PathElement__Alternatives1959);
                    rule__PathElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathElementAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Alternatives"


    // $ANTLR start "rule__LinkSpec__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:938:1: rule__LinkSpec__Group__0 : rule__LinkSpec__Group__0__Impl rule__LinkSpec__Group__1 ;
    public final void rule__LinkSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:942:1: ( rule__LinkSpec__Group__0__Impl rule__LinkSpec__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:943:2: rule__LinkSpec__Group__0__Impl rule__LinkSpec__Group__1
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__0__Impl_in_rule__LinkSpec__Group__01990);
            rule__LinkSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkSpec__Group__1_in_rule__LinkSpec__Group__01993);
            rule__LinkSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__0"


    // $ANTLR start "rule__LinkSpec__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:950:1: rule__LinkSpec__Group__0__Impl : ( 'link' ) ;
    public final void rule__LinkSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:954:1: ( ( 'link' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:955:1: ( 'link' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:955:1: ( 'link' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:956:1: 'link'
            {
             before(grammarAccess.getLinkSpecAccess().getLinkKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__LinkSpec__Group__0__Impl2021); 
             after(grammarAccess.getLinkSpecAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__0__Impl"


    // $ANTLR start "rule__LinkSpec__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:969:1: rule__LinkSpec__Group__1 : rule__LinkSpec__Group__1__Impl rule__LinkSpec__Group__2 ;
    public final void rule__LinkSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:973:1: ( rule__LinkSpec__Group__1__Impl rule__LinkSpec__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:974:2: rule__LinkSpec__Group__1__Impl rule__LinkSpec__Group__2
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__1__Impl_in_rule__LinkSpec__Group__12052);
            rule__LinkSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkSpec__Group__2_in_rule__LinkSpec__Group__12055);
            rule__LinkSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__1"


    // $ANTLR start "rule__LinkSpec__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:981:1: rule__LinkSpec__Group__1__Impl : ( ( rule__LinkSpec__Group_1__0 )? ) ;
    public final void rule__LinkSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:985:1: ( ( ( rule__LinkSpec__Group_1__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:986:1: ( ( rule__LinkSpec__Group_1__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:986:1: ( ( rule__LinkSpec__Group_1__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:987:1: ( rule__LinkSpec__Group_1__0 )?
            {
             before(grammarAccess.getLinkSpecAccess().getGroup_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:988:1: ( rule__LinkSpec__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==16) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:988:2: rule__LinkSpec__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LinkSpec__Group_1__0_in_rule__LinkSpec__Group__1__Impl2082);
                    rule__LinkSpec__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkSpecAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__1__Impl"


    // $ANTLR start "rule__LinkSpec__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:998:1: rule__LinkSpec__Group__2 : rule__LinkSpec__Group__2__Impl rule__LinkSpec__Group__3 ;
    public final void rule__LinkSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1002:1: ( rule__LinkSpec__Group__2__Impl rule__LinkSpec__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1003:2: rule__LinkSpec__Group__2__Impl rule__LinkSpec__Group__3
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__2__Impl_in_rule__LinkSpec__Group__22113);
            rule__LinkSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkSpec__Group__3_in_rule__LinkSpec__Group__22116);
            rule__LinkSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__2"


    // $ANTLR start "rule__LinkSpec__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1010:1: rule__LinkSpec__Group__2__Impl : ( ( rule__LinkSpec__NameAssignment_2 ) ) ;
    public final void rule__LinkSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1014:1: ( ( ( rule__LinkSpec__NameAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1015:1: ( ( rule__LinkSpec__NameAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1015:1: ( ( rule__LinkSpec__NameAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1016:1: ( rule__LinkSpec__NameAssignment_2 )
            {
             before(grammarAccess.getLinkSpecAccess().getNameAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1017:1: ( rule__LinkSpec__NameAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1017:2: rule__LinkSpec__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LinkSpec__NameAssignment_2_in_rule__LinkSpec__Group__2__Impl2143);
            rule__LinkSpec__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkSpecAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__2__Impl"


    // $ANTLR start "rule__LinkSpec__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1027:1: rule__LinkSpec__Group__3 : rule__LinkSpec__Group__3__Impl rule__LinkSpec__Group__4 ;
    public final void rule__LinkSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1031:1: ( rule__LinkSpec__Group__3__Impl rule__LinkSpec__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1032:2: rule__LinkSpec__Group__3__Impl rule__LinkSpec__Group__4
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__3__Impl_in_rule__LinkSpec__Group__32173);
            rule__LinkSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkSpec__Group__4_in_rule__LinkSpec__Group__32176);
            rule__LinkSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__3"


    // $ANTLR start "rule__LinkSpec__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1039:1: rule__LinkSpec__Group__3__Impl : ( ';' ) ;
    public final void rule__LinkSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1043:1: ( ( ';' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1044:1: ( ';' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1044:1: ( ';' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1045:1: ';'
            {
             before(grammarAccess.getLinkSpecAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__LinkSpec__Group__3__Impl2204); 
             after(grammarAccess.getLinkSpecAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__3__Impl"


    // $ANTLR start "rule__LinkSpec__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1058:1: rule__LinkSpec__Group__4 : rule__LinkSpec__Group__4__Impl ;
    public final void rule__LinkSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1062:1: ( rule__LinkSpec__Group__4__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1063:2: rule__LinkSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__4__Impl_in_rule__LinkSpec__Group__42235);
            rule__LinkSpec__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__4"


    // $ANTLR start "rule__LinkSpec__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1069:1: rule__LinkSpec__Group__4__Impl : ( ( rule__LinkSpec__ConstructorsAssignment_4 )* ) ;
    public final void rule__LinkSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1073:1: ( ( ( rule__LinkSpec__ConstructorsAssignment_4 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1074:1: ( ( rule__LinkSpec__ConstructorsAssignment_4 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1074:1: ( ( rule__LinkSpec__ConstructorsAssignment_4 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1075:1: ( rule__LinkSpec__ConstructorsAssignment_4 )*
            {
             before(grammarAccess.getLinkSpecAccess().getConstructorsAssignment_4()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1076:1: ( rule__LinkSpec__ConstructorsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1076:2: rule__LinkSpec__ConstructorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__LinkSpec__ConstructorsAssignment_4_in_rule__LinkSpec__Group__4__Impl2262);
            	    rule__LinkSpec__ConstructorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLinkSpecAccess().getConstructorsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__4__Impl"


    // $ANTLR start "rule__LinkSpec__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1096:1: rule__LinkSpec__Group_1__0 : rule__LinkSpec__Group_1__0__Impl rule__LinkSpec__Group_1__1 ;
    public final void rule__LinkSpec__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1100:1: ( rule__LinkSpec__Group_1__0__Impl rule__LinkSpec__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1101:2: rule__LinkSpec__Group_1__0__Impl rule__LinkSpec__Group_1__1
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group_1__0__Impl_in_rule__LinkSpec__Group_1__02303);
            rule__LinkSpec__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkSpec__Group_1__1_in_rule__LinkSpec__Group_1__02306);
            rule__LinkSpec__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group_1__0"


    // $ANTLR start "rule__LinkSpec__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1108:1: rule__LinkSpec__Group_1__0__Impl : ( ( rule__LinkSpec__PackagenameAssignment_1_0 ) ) ;
    public final void rule__LinkSpec__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1112:1: ( ( ( rule__LinkSpec__PackagenameAssignment_1_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1113:1: ( ( rule__LinkSpec__PackagenameAssignment_1_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1113:1: ( ( rule__LinkSpec__PackagenameAssignment_1_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1114:1: ( rule__LinkSpec__PackagenameAssignment_1_0 )
            {
             before(grammarAccess.getLinkSpecAccess().getPackagenameAssignment_1_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1115:1: ( rule__LinkSpec__PackagenameAssignment_1_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1115:2: rule__LinkSpec__PackagenameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__LinkSpec__PackagenameAssignment_1_0_in_rule__LinkSpec__Group_1__0__Impl2333);
            rule__LinkSpec__PackagenameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLinkSpecAccess().getPackagenameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group_1__0__Impl"


    // $ANTLR start "rule__LinkSpec__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1125:1: rule__LinkSpec__Group_1__1 : rule__LinkSpec__Group_1__1__Impl ;
    public final void rule__LinkSpec__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1129:1: ( rule__LinkSpec__Group_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1130:2: rule__LinkSpec__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group_1__1__Impl_in_rule__LinkSpec__Group_1__12363);
            rule__LinkSpec__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group_1__1"


    // $ANTLR start "rule__LinkSpec__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1136:1: rule__LinkSpec__Group_1__1__Impl : ( '.' ) ;
    public final void rule__LinkSpec__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1140:1: ( ( '.' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1141:1: ( '.' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1141:1: ( '.' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1142:1: '.'
            {
             before(grammarAccess.getLinkSpecAccess().getFullStopKeyword_1_1()); 
            match(input,16,FOLLOW_16_in_rule__LinkSpec__Group_1__1__Impl2391); 
             after(grammarAccess.getLinkSpecAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group_1__1__Impl"


    // $ANTLR start "rule__Constructor__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1159:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1163:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1164:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__02426);
            rule__Constructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02429);
            rule__Constructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0"


    // $ANTLR start "rule__Constructor__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1171:1: rule__Constructor__Group__0__Impl : ( ( rule__Constructor__IsPublicAssignment_0 )? ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1175:1: ( ( ( rule__Constructor__IsPublicAssignment_0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1176:1: ( ( rule__Constructor__IsPublicAssignment_0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1176:1: ( ( rule__Constructor__IsPublicAssignment_0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1177:1: ( rule__Constructor__IsPublicAssignment_0 )?
            {
             before(grammarAccess.getConstructorAccess().getIsPublicAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1178:1: ( rule__Constructor__IsPublicAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1178:2: rule__Constructor__IsPublicAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Constructor__IsPublicAssignment_0_in_rule__Constructor__Group__0__Impl2456);
                    rule__Constructor__IsPublicAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getIsPublicAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0__Impl"


    // $ANTLR start "rule__Constructor__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1188:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1192:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1193:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__12487);
            rule__Constructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12490);
            rule__Constructor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1"


    // $ANTLR start "rule__Constructor__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1200:1: rule__Constructor__Group__1__Impl : ( ( rule__Constructor__NameAssignment_1 ) ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1204:1: ( ( ( rule__Constructor__NameAssignment_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1205:1: ( ( rule__Constructor__NameAssignment_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1205:1: ( ( rule__Constructor__NameAssignment_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1206:1: ( rule__Constructor__NameAssignment_1 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1207:1: ( rule__Constructor__NameAssignment_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1207:2: rule__Constructor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constructor__NameAssignment_1_in_rule__Constructor__Group__1__Impl2517);
            rule__Constructor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1__Impl"


    // $ANTLR start "rule__Constructor__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1217:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1221:1: ( rule__Constructor__Group__2__Impl rule__Constructor__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1222:2: rule__Constructor__Group__2__Impl rule__Constructor__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__22547);
            rule__Constructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22550);
            rule__Constructor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2"


    // $ANTLR start "rule__Constructor__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1229:1: rule__Constructor__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1233:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1234:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1234:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1235:1: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Constructor__Group__2__Impl2578); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2__Impl"


    // $ANTLR start "rule__Constructor__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1248:1: rule__Constructor__Group__3 : rule__Constructor__Group__3__Impl rule__Constructor__Group__4 ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1252:1: ( rule__Constructor__Group__3__Impl rule__Constructor__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1253:2: rule__Constructor__Group__3__Impl rule__Constructor__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__32609);
            rule__Constructor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__32612);
            rule__Constructor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__3"


    // $ANTLR start "rule__Constructor__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1260:1: rule__Constructor__Group__3__Impl : ( ( rule__Constructor__Group_3__0 )? ) ;
    public final void rule__Constructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1264:1: ( ( ( rule__Constructor__Group_3__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1265:1: ( ( rule__Constructor__Group_3__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1265:1: ( ( rule__Constructor__Group_3__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1266:1: ( rule__Constructor__Group_3__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1267:1: ( rule__Constructor__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1267:2: rule__Constructor__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Constructor__Group_3__0_in_rule__Constructor__Group__3__Impl2639);
                    rule__Constructor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__3__Impl"


    // $ANTLR start "rule__Constructor__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1277:1: rule__Constructor__Group__4 : rule__Constructor__Group__4__Impl rule__Constructor__Group__5 ;
    public final void rule__Constructor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1281:1: ( rule__Constructor__Group__4__Impl rule__Constructor__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1282:2: rule__Constructor__Group__4__Impl rule__Constructor__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__42670);
            rule__Constructor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__42673);
            rule__Constructor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__4"


    // $ANTLR start "rule__Constructor__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1289:1: rule__Constructor__Group__4__Impl : ( ')' ) ;
    public final void rule__Constructor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1293:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1294:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1294:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1295:1: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Constructor__Group__4__Impl2701); 
             after(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__4__Impl"


    // $ANTLR start "rule__Constructor__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1308:1: rule__Constructor__Group__5 : rule__Constructor__Group__5__Impl rule__Constructor__Group__6 ;
    public final void rule__Constructor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1312:1: ( rule__Constructor__Group__5__Impl rule__Constructor__Group__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1313:2: rule__Constructor__Group__5__Impl rule__Constructor__Group__6
            {
            pushFollow(FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__52732);
            rule__Constructor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__52735);
            rule__Constructor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__5"


    // $ANTLR start "rule__Constructor__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1320:1: rule__Constructor__Group__5__Impl : ( ( rule__Constructor__Group_5__0 )? ) ;
    public final void rule__Constructor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1324:1: ( ( ( rule__Constructor__Group_5__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1325:1: ( ( rule__Constructor__Group_5__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1325:1: ( ( rule__Constructor__Group_5__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1326:1: ( rule__Constructor__Group_5__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_5()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1327:1: ( rule__Constructor__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1327:2: rule__Constructor__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Constructor__Group_5__0_in_rule__Constructor__Group__5__Impl2762);
                    rule__Constructor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__5__Impl"


    // $ANTLR start "rule__Constructor__Group__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1337:1: rule__Constructor__Group__6 : rule__Constructor__Group__6__Impl rule__Constructor__Group__7 ;
    public final void rule__Constructor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1341:1: ( rule__Constructor__Group__6__Impl rule__Constructor__Group__7 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1342:2: rule__Constructor__Group__6__Impl rule__Constructor__Group__7
            {
            pushFollow(FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__62793);
            rule__Constructor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__62796);
            rule__Constructor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__6"


    // $ANTLR start "rule__Constructor__Group__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1349:1: rule__Constructor__Group__6__Impl : ( '{' ) ;
    public final void rule__Constructor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1353:1: ( ( '{' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1354:1: ( '{' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1354:1: ( '{' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1355:1: '{'
            {
             before(grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Constructor__Group__6__Impl2824); 
             after(grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__6__Impl"


    // $ANTLR start "rule__Constructor__Group__7"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1368:1: rule__Constructor__Group__7 : rule__Constructor__Group__7__Impl rule__Constructor__Group__8 ;
    public final void rule__Constructor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1372:1: ( rule__Constructor__Group__7__Impl rule__Constructor__Group__8 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1373:2: rule__Constructor__Group__7__Impl rule__Constructor__Group__8
            {
            pushFollow(FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__72855);
            rule__Constructor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__8_in_rule__Constructor__Group__72858);
            rule__Constructor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__7"


    // $ANTLR start "rule__Constructor__Group__7__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1380:1: rule__Constructor__Group__7__Impl : ( ( rule__Constructor__Group_7__0 )* ) ;
    public final void rule__Constructor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1384:1: ( ( ( rule__Constructor__Group_7__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1385:1: ( ( rule__Constructor__Group_7__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1385:1: ( ( rule__Constructor__Group_7__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1386:1: ( rule__Constructor__Group_7__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_7()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1387:1: ( rule__Constructor__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=23 && LA15_0<=24)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1387:2: rule__Constructor__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__Group_7__0_in_rule__Constructor__Group__7__Impl2885);
            	    rule__Constructor__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__7__Impl"


    // $ANTLR start "rule__Constructor__Group__8"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1397:1: rule__Constructor__Group__8 : rule__Constructor__Group__8__Impl ;
    public final void rule__Constructor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1401:1: ( rule__Constructor__Group__8__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1402:2: rule__Constructor__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group__8__Impl_in_rule__Constructor__Group__82916);
            rule__Constructor__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__8"


    // $ANTLR start "rule__Constructor__Group__8__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1408:1: rule__Constructor__Group__8__Impl : ( '}' ) ;
    public final void rule__Constructor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1412:1: ( ( '}' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1413:1: ( '}' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1413:1: ( '}' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1414:1: '}'
            {
             before(grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Constructor__Group__8__Impl2944); 
             after(grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__8__Impl"


    // $ANTLR start "rule__Constructor__Group_3__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1445:1: rule__Constructor__Group_3__0 : rule__Constructor__Group_3__0__Impl rule__Constructor__Group_3__1 ;
    public final void rule__Constructor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1449:1: ( rule__Constructor__Group_3__0__Impl rule__Constructor__Group_3__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1450:2: rule__Constructor__Group_3__0__Impl rule__Constructor__Group_3__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group_3__0__Impl_in_rule__Constructor__Group_3__02993);
            rule__Constructor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group_3__1_in_rule__Constructor__Group_3__02996);
            rule__Constructor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3__0"


    // $ANTLR start "rule__Constructor__Group_3__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1457:1: rule__Constructor__Group_3__0__Impl : ( ( rule__Constructor__ParametersAssignment_3_0 ) ) ;
    public final void rule__Constructor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1461:1: ( ( ( rule__Constructor__ParametersAssignment_3_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1462:1: ( ( rule__Constructor__ParametersAssignment_3_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1462:1: ( ( rule__Constructor__ParametersAssignment_3_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1463:1: ( rule__Constructor__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getConstructorAccess().getParametersAssignment_3_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1464:1: ( rule__Constructor__ParametersAssignment_3_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1464:2: rule__Constructor__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Constructor__ParametersAssignment_3_0_in_rule__Constructor__Group_3__0__Impl3023);
            rule__Constructor__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3__0__Impl"


    // $ANTLR start "rule__Constructor__Group_3__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1474:1: rule__Constructor__Group_3__1 : rule__Constructor__Group_3__1__Impl ;
    public final void rule__Constructor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1478:1: ( rule__Constructor__Group_3__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1479:2: rule__Constructor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group_3__1__Impl_in_rule__Constructor__Group_3__13053);
            rule__Constructor__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3__1"


    // $ANTLR start "rule__Constructor__Group_3__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1485:1: rule__Constructor__Group_3__1__Impl : ( ( rule__Constructor__Group_3_1__0 )* ) ;
    public final void rule__Constructor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1489:1: ( ( ( rule__Constructor__Group_3_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1490:1: ( ( rule__Constructor__Group_3_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1490:1: ( ( rule__Constructor__Group_3_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1491:1: ( rule__Constructor__Group_3_1__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_3_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1492:1: ( rule__Constructor__Group_3_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1492:2: rule__Constructor__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__Group_3_1__0_in_rule__Constructor__Group_3__1__Impl3080);
            	    rule__Constructor__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3__1__Impl"


    // $ANTLR start "rule__Constructor__Group_3_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1506:1: rule__Constructor__Group_3_1__0 : rule__Constructor__Group_3_1__0__Impl rule__Constructor__Group_3_1__1 ;
    public final void rule__Constructor__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1510:1: ( rule__Constructor__Group_3_1__0__Impl rule__Constructor__Group_3_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1511:2: rule__Constructor__Group_3_1__0__Impl rule__Constructor__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group_3_1__0__Impl_in_rule__Constructor__Group_3_1__03115);
            rule__Constructor__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group_3_1__1_in_rule__Constructor__Group_3_1__03118);
            rule__Constructor__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3_1__0"


    // $ANTLR start "rule__Constructor__Group_3_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1518:1: rule__Constructor__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Constructor__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1522:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1523:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1523:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1524:1: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Constructor__Group_3_1__0__Impl3146); 
             after(grammarAccess.getConstructorAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3_1__0__Impl"


    // $ANTLR start "rule__Constructor__Group_3_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1537:1: rule__Constructor__Group_3_1__1 : rule__Constructor__Group_3_1__1__Impl ;
    public final void rule__Constructor__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1541:1: ( rule__Constructor__Group_3_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1542:2: rule__Constructor__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group_3_1__1__Impl_in_rule__Constructor__Group_3_1__13177);
            rule__Constructor__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3_1__1"


    // $ANTLR start "rule__Constructor__Group_3_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1548:1: rule__Constructor__Group_3_1__1__Impl : ( ( rule__Constructor__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__Constructor__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1552:1: ( ( ( rule__Constructor__ParametersAssignment_3_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1553:1: ( ( rule__Constructor__ParametersAssignment_3_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1553:1: ( ( rule__Constructor__ParametersAssignment_3_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1554:1: ( rule__Constructor__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getConstructorAccess().getParametersAssignment_3_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1555:1: ( rule__Constructor__ParametersAssignment_3_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1555:2: rule__Constructor__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Constructor__ParametersAssignment_3_1_1_in_rule__Constructor__Group_3_1__1__Impl3204);
            rule__Constructor__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3_1__1__Impl"


    // $ANTLR start "rule__Constructor__Group_5__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1569:1: rule__Constructor__Group_5__0 : rule__Constructor__Group_5__0__Impl rule__Constructor__Group_5__1 ;
    public final void rule__Constructor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1573:1: ( rule__Constructor__Group_5__0__Impl rule__Constructor__Group_5__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1574:2: rule__Constructor__Group_5__0__Impl rule__Constructor__Group_5__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group_5__0__Impl_in_rule__Constructor__Group_5__03238);
            rule__Constructor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group_5__1_in_rule__Constructor__Group_5__03241);
            rule__Constructor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_5__0"


    // $ANTLR start "rule__Constructor__Group_5__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1581:1: rule__Constructor__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Constructor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1585:1: ( ( ':' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1586:1: ( ':' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1586:1: ( ':' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1587:1: ':'
            {
             before(grammarAccess.getConstructorAccess().getColonKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Constructor__Group_5__0__Impl3269); 
             after(grammarAccess.getConstructorAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_5__0__Impl"


    // $ANTLR start "rule__Constructor__Group_5__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1600:1: rule__Constructor__Group_5__1 : rule__Constructor__Group_5__1__Impl ;
    public final void rule__Constructor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1604:1: ( rule__Constructor__Group_5__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1605:2: rule__Constructor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group_5__1__Impl_in_rule__Constructor__Group_5__13300);
            rule__Constructor__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_5__1"


    // $ANTLR start "rule__Constructor__Group_5__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1611:1: rule__Constructor__Group_5__1__Impl : ( ( rule__Constructor__AddressesAssignment_5_1 ) ) ;
    public final void rule__Constructor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1615:1: ( ( ( rule__Constructor__AddressesAssignment_5_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1616:1: ( ( rule__Constructor__AddressesAssignment_5_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1616:1: ( ( rule__Constructor__AddressesAssignment_5_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1617:1: ( rule__Constructor__AddressesAssignment_5_1 )
            {
             before(grammarAccess.getConstructorAccess().getAddressesAssignment_5_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1618:1: ( rule__Constructor__AddressesAssignment_5_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1618:2: rule__Constructor__AddressesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Constructor__AddressesAssignment_5_1_in_rule__Constructor__Group_5__1__Impl3327);
            rule__Constructor__AddressesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getAddressesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_5__1__Impl"


    // $ANTLR start "rule__Constructor__Group_7__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1632:1: rule__Constructor__Group_7__0 : rule__Constructor__Group_7__0__Impl rule__Constructor__Group_7__1 ;
    public final void rule__Constructor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1636:1: ( rule__Constructor__Group_7__0__Impl rule__Constructor__Group_7__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1637:2: rule__Constructor__Group_7__0__Impl rule__Constructor__Group_7__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group_7__0__Impl_in_rule__Constructor__Group_7__03361);
            rule__Constructor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group_7__1_in_rule__Constructor__Group_7__03364);
            rule__Constructor__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_7__0"


    // $ANTLR start "rule__Constructor__Group_7__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1644:1: rule__Constructor__Group_7__0__Impl : ( ( rule__Constructor__MembersAssignment_7_0 ) ) ;
    public final void rule__Constructor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1648:1: ( ( ( rule__Constructor__MembersAssignment_7_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1649:1: ( ( rule__Constructor__MembersAssignment_7_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1649:1: ( ( rule__Constructor__MembersAssignment_7_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1650:1: ( rule__Constructor__MembersAssignment_7_0 )
            {
             before(grammarAccess.getConstructorAccess().getMembersAssignment_7_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1651:1: ( rule__Constructor__MembersAssignment_7_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1651:2: rule__Constructor__MembersAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Constructor__MembersAssignment_7_0_in_rule__Constructor__Group_7__0__Impl3391);
            rule__Constructor__MembersAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getMembersAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_7__0__Impl"


    // $ANTLR start "rule__Constructor__Group_7__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1661:1: rule__Constructor__Group_7__1 : rule__Constructor__Group_7__1__Impl ;
    public final void rule__Constructor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1665:1: ( rule__Constructor__Group_7__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1666:2: rule__Constructor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group_7__1__Impl_in_rule__Constructor__Group_7__13421);
            rule__Constructor__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_7__1"


    // $ANTLR start "rule__Constructor__Group_7__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1672:1: rule__Constructor__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Constructor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1676:1: ( ( ';' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1677:1: ( ';' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1677:1: ( ';' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1678:1: ';'
            {
             before(grammarAccess.getConstructorAccess().getSemicolonKeyword_7_1()); 
            match(input,15,FOLLOW_15_in_rule__Constructor__Group_7__1__Impl3449); 
             after(grammarAccess.getConstructorAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_7__1__Impl"


    // $ANTLR start "rule__NamedAddresses__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1695:1: rule__NamedAddresses__Group__0 : rule__NamedAddresses__Group__0__Impl rule__NamedAddresses__Group__1 ;
    public final void rule__NamedAddresses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1699:1: ( rule__NamedAddresses__Group__0__Impl rule__NamedAddresses__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1700:2: rule__NamedAddresses__Group__0__Impl rule__NamedAddresses__Group__1
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group__0__Impl_in_rule__NamedAddresses__Group__03484);
            rule__NamedAddresses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedAddresses__Group__1_in_rule__NamedAddresses__Group__03487);
            rule__NamedAddresses__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__0"


    // $ANTLR start "rule__NamedAddresses__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1707:1: rule__NamedAddresses__Group__0__Impl : ( '@' ) ;
    public final void rule__NamedAddresses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1711:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1712:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1712:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1713:1: '@'
            {
             before(grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__NamedAddresses__Group__0__Impl3515); 
             after(grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__0__Impl"


    // $ANTLR start "rule__NamedAddresses__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1726:1: rule__NamedAddresses__Group__1 : rule__NamedAddresses__Group__1__Impl rule__NamedAddresses__Group__2 ;
    public final void rule__NamedAddresses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1730:1: ( rule__NamedAddresses__Group__1__Impl rule__NamedAddresses__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1731:2: rule__NamedAddresses__Group__1__Impl rule__NamedAddresses__Group__2
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group__1__Impl_in_rule__NamedAddresses__Group__13546);
            rule__NamedAddresses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedAddresses__Group__2_in_rule__NamedAddresses__Group__13549);
            rule__NamedAddresses__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__1"


    // $ANTLR start "rule__NamedAddresses__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1738:1: rule__NamedAddresses__Group__1__Impl : ( ( rule__NamedAddresses__AddressNamesAssignment_1 ) ) ;
    public final void rule__NamedAddresses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1742:1: ( ( ( rule__NamedAddresses__AddressNamesAssignment_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1743:1: ( ( rule__NamedAddresses__AddressNamesAssignment_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1743:1: ( ( rule__NamedAddresses__AddressNamesAssignment_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1744:1: ( rule__NamedAddresses__AddressNamesAssignment_1 )
            {
             before(grammarAccess.getNamedAddressesAccess().getAddressNamesAssignment_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1745:1: ( rule__NamedAddresses__AddressNamesAssignment_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1745:2: rule__NamedAddresses__AddressNamesAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedAddresses__AddressNamesAssignment_1_in_rule__NamedAddresses__Group__1__Impl3576);
            rule__NamedAddresses__AddressNamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedAddressesAccess().getAddressNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__1__Impl"


    // $ANTLR start "rule__NamedAddresses__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1755:1: rule__NamedAddresses__Group__2 : rule__NamedAddresses__Group__2__Impl ;
    public final void rule__NamedAddresses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1759:1: ( rule__NamedAddresses__Group__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1760:2: rule__NamedAddresses__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group__2__Impl_in_rule__NamedAddresses__Group__23606);
            rule__NamedAddresses__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__2"


    // $ANTLR start "rule__NamedAddresses__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1766:1: rule__NamedAddresses__Group__2__Impl : ( ( rule__NamedAddresses__Group_2__0 )* ) ;
    public final void rule__NamedAddresses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1770:1: ( ( ( rule__NamedAddresses__Group_2__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1771:1: ( ( rule__NamedAddresses__Group_2__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1771:1: ( ( rule__NamedAddresses__Group_2__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1772:1: ( rule__NamedAddresses__Group_2__0 )*
            {
             before(grammarAccess.getNamedAddressesAccess().getGroup_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1773:1: ( rule__NamedAddresses__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1773:2: rule__NamedAddresses__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NamedAddresses__Group_2__0_in_rule__NamedAddresses__Group__2__Impl3633);
            	    rule__NamedAddresses__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNamedAddressesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__2__Impl"


    // $ANTLR start "rule__NamedAddresses__Group_2__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1789:1: rule__NamedAddresses__Group_2__0 : rule__NamedAddresses__Group_2__0__Impl rule__NamedAddresses__Group_2__1 ;
    public final void rule__NamedAddresses__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1793:1: ( rule__NamedAddresses__Group_2__0__Impl rule__NamedAddresses__Group_2__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1794:2: rule__NamedAddresses__Group_2__0__Impl rule__NamedAddresses__Group_2__1
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__0__Impl_in_rule__NamedAddresses__Group_2__03670);
            rule__NamedAddresses__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__1_in_rule__NamedAddresses__Group_2__03673);
            rule__NamedAddresses__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__0"


    // $ANTLR start "rule__NamedAddresses__Group_2__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1801:1: rule__NamedAddresses__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NamedAddresses__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1805:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1806:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1806:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1807:1: ','
            {
             before(grammarAccess.getNamedAddressesAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__NamedAddresses__Group_2__0__Impl3701); 
             after(grammarAccess.getNamedAddressesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__0__Impl"


    // $ANTLR start "rule__NamedAddresses__Group_2__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1820:1: rule__NamedAddresses__Group_2__1 : rule__NamedAddresses__Group_2__1__Impl rule__NamedAddresses__Group_2__2 ;
    public final void rule__NamedAddresses__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1824:1: ( rule__NamedAddresses__Group_2__1__Impl rule__NamedAddresses__Group_2__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1825:2: rule__NamedAddresses__Group_2__1__Impl rule__NamedAddresses__Group_2__2
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__1__Impl_in_rule__NamedAddresses__Group_2__13732);
            rule__NamedAddresses__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__2_in_rule__NamedAddresses__Group_2__13735);
            rule__NamedAddresses__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__1"


    // $ANTLR start "rule__NamedAddresses__Group_2__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1832:1: rule__NamedAddresses__Group_2__1__Impl : ( '@' ) ;
    public final void rule__NamedAddresses__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1836:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1837:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1837:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1838:1: '@'
            {
             before(grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_2_1()); 
            match(input,23,FOLLOW_23_in_rule__NamedAddresses__Group_2__1__Impl3763); 
             after(grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__1__Impl"


    // $ANTLR start "rule__NamedAddresses__Group_2__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1851:1: rule__NamedAddresses__Group_2__2 : rule__NamedAddresses__Group_2__2__Impl ;
    public final void rule__NamedAddresses__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1855:1: ( rule__NamedAddresses__Group_2__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1856:2: rule__NamedAddresses__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__2__Impl_in_rule__NamedAddresses__Group_2__23794);
            rule__NamedAddresses__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__2"


    // $ANTLR start "rule__NamedAddresses__Group_2__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1862:1: rule__NamedAddresses__Group_2__2__Impl : ( ( rule__NamedAddresses__AddressNamesAssignment_2_2 ) ) ;
    public final void rule__NamedAddresses__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1866:1: ( ( ( rule__NamedAddresses__AddressNamesAssignment_2_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1867:1: ( ( rule__NamedAddresses__AddressNamesAssignment_2_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1867:1: ( ( rule__NamedAddresses__AddressNamesAssignment_2_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1868:1: ( rule__NamedAddresses__AddressNamesAssignment_2_2 )
            {
             before(grammarAccess.getNamedAddressesAccess().getAddressNamesAssignment_2_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1869:1: ( rule__NamedAddresses__AddressNamesAssignment_2_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1869:2: rule__NamedAddresses__AddressNamesAssignment_2_2
            {
            pushFollow(FOLLOW_rule__NamedAddresses__AddressNamesAssignment_2_2_in_rule__NamedAddresses__Group_2__2__Impl3821);
            rule__NamedAddresses__AddressNamesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedAddressesAccess().getAddressNamesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__2__Impl"


    // $ANTLR start "rule__AddressTuple__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1885:1: rule__AddressTuple__Group__0 : rule__AddressTuple__Group__0__Impl rule__AddressTuple__Group__1 ;
    public final void rule__AddressTuple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1889:1: ( rule__AddressTuple__Group__0__Impl rule__AddressTuple__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1890:2: rule__AddressTuple__Group__0__Impl rule__AddressTuple__Group__1
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__0__Impl_in_rule__AddressTuple__Group__03857);
            rule__AddressTuple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group__1_in_rule__AddressTuple__Group__03860);
            rule__AddressTuple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__0"


    // $ANTLR start "rule__AddressTuple__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1897:1: rule__AddressTuple__Group__0__Impl : ( '@' ) ;
    public final void rule__AddressTuple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1901:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1902:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1902:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1903:1: '@'
            {
             before(grammarAccess.getAddressTupleAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__AddressTuple__Group__0__Impl3888); 
             after(grammarAccess.getAddressTupleAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__0__Impl"


    // $ANTLR start "rule__AddressTuple__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1916:1: rule__AddressTuple__Group__1 : rule__AddressTuple__Group__1__Impl rule__AddressTuple__Group__2 ;
    public final void rule__AddressTuple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1920:1: ( rule__AddressTuple__Group__1__Impl rule__AddressTuple__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1921:2: rule__AddressTuple__Group__1__Impl rule__AddressTuple__Group__2
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__1__Impl_in_rule__AddressTuple__Group__13919);
            rule__AddressTuple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group__2_in_rule__AddressTuple__Group__13922);
            rule__AddressTuple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__1"


    // $ANTLR start "rule__AddressTuple__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1928:1: rule__AddressTuple__Group__1__Impl : ( '(' ) ;
    public final void rule__AddressTuple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1932:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1933:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1933:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1934:1: '('
            {
             before(grammarAccess.getAddressTupleAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__AddressTuple__Group__1__Impl3950); 
             after(grammarAccess.getAddressTupleAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__1__Impl"


    // $ANTLR start "rule__AddressTuple__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1947:1: rule__AddressTuple__Group__2 : rule__AddressTuple__Group__2__Impl rule__AddressTuple__Group__3 ;
    public final void rule__AddressTuple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1951:1: ( rule__AddressTuple__Group__2__Impl rule__AddressTuple__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1952:2: rule__AddressTuple__Group__2__Impl rule__AddressTuple__Group__3
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__2__Impl_in_rule__AddressTuple__Group__23981);
            rule__AddressTuple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group__3_in_rule__AddressTuple__Group__23984);
            rule__AddressTuple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__2"


    // $ANTLR start "rule__AddressTuple__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1959:1: rule__AddressTuple__Group__2__Impl : ( ( rule__AddressTuple__ElementsAssignment_2 ) ) ;
    public final void rule__AddressTuple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1963:1: ( ( ( rule__AddressTuple__ElementsAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1964:1: ( ( rule__AddressTuple__ElementsAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1964:1: ( ( rule__AddressTuple__ElementsAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1965:1: ( rule__AddressTuple__ElementsAssignment_2 )
            {
             before(grammarAccess.getAddressTupleAccess().getElementsAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1966:1: ( rule__AddressTuple__ElementsAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1966:2: rule__AddressTuple__ElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__AddressTuple__ElementsAssignment_2_in_rule__AddressTuple__Group__2__Impl4011);
            rule__AddressTuple__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddressTupleAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__2__Impl"


    // $ANTLR start "rule__AddressTuple__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1976:1: rule__AddressTuple__Group__3 : rule__AddressTuple__Group__3__Impl rule__AddressTuple__Group__4 ;
    public final void rule__AddressTuple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1980:1: ( rule__AddressTuple__Group__3__Impl rule__AddressTuple__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1981:2: rule__AddressTuple__Group__3__Impl rule__AddressTuple__Group__4
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__3__Impl_in_rule__AddressTuple__Group__34041);
            rule__AddressTuple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group__4_in_rule__AddressTuple__Group__34044);
            rule__AddressTuple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__3"


    // $ANTLR start "rule__AddressTuple__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1988:1: rule__AddressTuple__Group__3__Impl : ( ( rule__AddressTuple__Group_3__0 )* ) ;
    public final void rule__AddressTuple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1992:1: ( ( ( rule__AddressTuple__Group_3__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1993:1: ( ( rule__AddressTuple__Group_3__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1993:1: ( ( rule__AddressTuple__Group_3__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1994:1: ( rule__AddressTuple__Group_3__0 )*
            {
             before(grammarAccess.getAddressTupleAccess().getGroup_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1995:1: ( rule__AddressTuple__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1995:2: rule__AddressTuple__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__AddressTuple__Group_3__0_in_rule__AddressTuple__Group__3__Impl4071);
            	    rule__AddressTuple__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAddressTupleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__3__Impl"


    // $ANTLR start "rule__AddressTuple__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2005:1: rule__AddressTuple__Group__4 : rule__AddressTuple__Group__4__Impl ;
    public final void rule__AddressTuple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2009:1: ( rule__AddressTuple__Group__4__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2010:2: rule__AddressTuple__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__4__Impl_in_rule__AddressTuple__Group__44102);
            rule__AddressTuple__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__4"


    // $ANTLR start "rule__AddressTuple__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2016:1: rule__AddressTuple__Group__4__Impl : ( ')' ) ;
    public final void rule__AddressTuple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2020:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2021:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2021:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2022:1: ')'
            {
             before(grammarAccess.getAddressTupleAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__AddressTuple__Group__4__Impl4130); 
             after(grammarAccess.getAddressTupleAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__4__Impl"


    // $ANTLR start "rule__AddressTuple__Group_3__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2045:1: rule__AddressTuple__Group_3__0 : rule__AddressTuple__Group_3__0__Impl rule__AddressTuple__Group_3__1 ;
    public final void rule__AddressTuple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2049:1: ( rule__AddressTuple__Group_3__0__Impl rule__AddressTuple__Group_3__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2050:2: rule__AddressTuple__Group_3__0__Impl rule__AddressTuple__Group_3__1
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group_3__0__Impl_in_rule__AddressTuple__Group_3__04171);
            rule__AddressTuple__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group_3__1_in_rule__AddressTuple__Group_3__04174);
            rule__AddressTuple__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group_3__0"


    // $ANTLR start "rule__AddressTuple__Group_3__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2057:1: rule__AddressTuple__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AddressTuple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2061:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2062:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2062:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2063:1: ','
            {
             before(grammarAccess.getAddressTupleAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__AddressTuple__Group_3__0__Impl4202); 
             after(grammarAccess.getAddressTupleAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group_3__0__Impl"


    // $ANTLR start "rule__AddressTuple__Group_3__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2076:1: rule__AddressTuple__Group_3__1 : rule__AddressTuple__Group_3__1__Impl ;
    public final void rule__AddressTuple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2080:1: ( rule__AddressTuple__Group_3__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2081:2: rule__AddressTuple__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group_3__1__Impl_in_rule__AddressTuple__Group_3__14233);
            rule__AddressTuple__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group_3__1"


    // $ANTLR start "rule__AddressTuple__Group_3__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2087:1: rule__AddressTuple__Group_3__1__Impl : ( ( rule__AddressTuple__ElementsAssignment_3_1 ) ) ;
    public final void rule__AddressTuple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2091:1: ( ( ( rule__AddressTuple__ElementsAssignment_3_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2092:1: ( ( rule__AddressTuple__ElementsAssignment_3_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2092:1: ( ( rule__AddressTuple__ElementsAssignment_3_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2093:1: ( rule__AddressTuple__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getAddressTupleAccess().getElementsAssignment_3_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2094:1: ( rule__AddressTuple__ElementsAssignment_3_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2094:2: rule__AddressTuple__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AddressTuple__ElementsAssignment_3_1_in_rule__AddressTuple__Group_3__1__Impl4260);
            rule__AddressTuple__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressTupleAccess().getElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group_3__1__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2108:1: rule__TosNetLinkBinding__Group__0 : rule__TosNetLinkBinding__Group__0__Impl rule__TosNetLinkBinding__Group__1 ;
    public final void rule__TosNetLinkBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2112:1: ( rule__TosNetLinkBinding__Group__0__Impl rule__TosNetLinkBinding__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2113:2: rule__TosNetLinkBinding__Group__0__Impl rule__TosNetLinkBinding__Group__1
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__0__Impl_in_rule__TosNetLinkBinding__Group__04294);
            rule__TosNetLinkBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__1_in_rule__TosNetLinkBinding__Group__04297);
            rule__TosNetLinkBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__0"


    // $ANTLR start "rule__TosNetLinkBinding__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2120:1: rule__TosNetLinkBinding__Group__0__Impl : ( 'TOSNET' ) ;
    public final void rule__TosNetLinkBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2124:1: ( ( 'TOSNET' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2125:1: ( 'TOSNET' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2125:1: ( 'TOSNET' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2126:1: 'TOSNET'
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getTOSNETKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__TosNetLinkBinding__Group__0__Impl4325); 
             after(grammarAccess.getTosNetLinkBindingAccess().getTOSNETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__0__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2139:1: rule__TosNetLinkBinding__Group__1 : rule__TosNetLinkBinding__Group__1__Impl rule__TosNetLinkBinding__Group__2 ;
    public final void rule__TosNetLinkBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2143:1: ( rule__TosNetLinkBinding__Group__1__Impl rule__TosNetLinkBinding__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2144:2: rule__TosNetLinkBinding__Group__1__Impl rule__TosNetLinkBinding__Group__2
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__1__Impl_in_rule__TosNetLinkBinding__Group__14356);
            rule__TosNetLinkBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__2_in_rule__TosNetLinkBinding__Group__14359);
            rule__TosNetLinkBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__1"


    // $ANTLR start "rule__TosNetLinkBinding__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2151:1: rule__TosNetLinkBinding__Group__1__Impl : ( '(' ) ;
    public final void rule__TosNetLinkBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2155:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2156:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2156:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2157:1: '('
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__TosNetLinkBinding__Group__1__Impl4387); 
             after(grammarAccess.getTosNetLinkBindingAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__1__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2170:1: rule__TosNetLinkBinding__Group__2 : rule__TosNetLinkBinding__Group__2__Impl rule__TosNetLinkBinding__Group__3 ;
    public final void rule__TosNetLinkBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2174:1: ( rule__TosNetLinkBinding__Group__2__Impl rule__TosNetLinkBinding__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2175:2: rule__TosNetLinkBinding__Group__2__Impl rule__TosNetLinkBinding__Group__3
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__2__Impl_in_rule__TosNetLinkBinding__Group__24418);
            rule__TosNetLinkBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__3_in_rule__TosNetLinkBinding__Group__24421);
            rule__TosNetLinkBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__2"


    // $ANTLR start "rule__TosNetLinkBinding__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2182:1: rule__TosNetLinkBinding__Group__2__Impl : ( ( rule__TosNetLinkBinding__PropertiesAssignment_2 ) ) ;
    public final void rule__TosNetLinkBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2186:1: ( ( ( rule__TosNetLinkBinding__PropertiesAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2187:1: ( ( rule__TosNetLinkBinding__PropertiesAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2187:1: ( ( rule__TosNetLinkBinding__PropertiesAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2188:1: ( rule__TosNetLinkBinding__PropertiesAssignment_2 )
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getPropertiesAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2189:1: ( rule__TosNetLinkBinding__PropertiesAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2189:2: rule__TosNetLinkBinding__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__PropertiesAssignment_2_in_rule__TosNetLinkBinding__Group__2__Impl4448);
            rule__TosNetLinkBinding__PropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTosNetLinkBindingAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__2__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2199:1: rule__TosNetLinkBinding__Group__3 : rule__TosNetLinkBinding__Group__3__Impl rule__TosNetLinkBinding__Group__4 ;
    public final void rule__TosNetLinkBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2203:1: ( rule__TosNetLinkBinding__Group__3__Impl rule__TosNetLinkBinding__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2204:2: rule__TosNetLinkBinding__Group__3__Impl rule__TosNetLinkBinding__Group__4
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__3__Impl_in_rule__TosNetLinkBinding__Group__34478);
            rule__TosNetLinkBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__4_in_rule__TosNetLinkBinding__Group__34481);
            rule__TosNetLinkBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__3"


    // $ANTLR start "rule__TosNetLinkBinding__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2211:1: rule__TosNetLinkBinding__Group__3__Impl : ( ( rule__TosNetLinkBinding__Group_3__0 )* ) ;
    public final void rule__TosNetLinkBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2215:1: ( ( ( rule__TosNetLinkBinding__Group_3__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2216:1: ( ( rule__TosNetLinkBinding__Group_3__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2216:1: ( ( rule__TosNetLinkBinding__Group_3__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2217:1: ( rule__TosNetLinkBinding__Group_3__0 )*
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getGroup_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2218:1: ( rule__TosNetLinkBinding__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2218:2: rule__TosNetLinkBinding__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TosNetLinkBinding__Group_3__0_in_rule__TosNetLinkBinding__Group__3__Impl4508);
            	    rule__TosNetLinkBinding__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTosNetLinkBindingAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__3__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2228:1: rule__TosNetLinkBinding__Group__4 : rule__TosNetLinkBinding__Group__4__Impl ;
    public final void rule__TosNetLinkBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2232:1: ( rule__TosNetLinkBinding__Group__4__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2233:2: rule__TosNetLinkBinding__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__4__Impl_in_rule__TosNetLinkBinding__Group__44539);
            rule__TosNetLinkBinding__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__4"


    // $ANTLR start "rule__TosNetLinkBinding__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2239:1: rule__TosNetLinkBinding__Group__4__Impl : ( ')' ) ;
    public final void rule__TosNetLinkBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2243:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2244:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2244:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2245:1: ')'
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__TosNetLinkBinding__Group__4__Impl4567); 
             after(grammarAccess.getTosNetLinkBindingAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__4__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group_3__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2268:1: rule__TosNetLinkBinding__Group_3__0 : rule__TosNetLinkBinding__Group_3__0__Impl rule__TosNetLinkBinding__Group_3__1 ;
    public final void rule__TosNetLinkBinding__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2272:1: ( rule__TosNetLinkBinding__Group_3__0__Impl rule__TosNetLinkBinding__Group_3__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2273:2: rule__TosNetLinkBinding__Group_3__0__Impl rule__TosNetLinkBinding__Group_3__1
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group_3__0__Impl_in_rule__TosNetLinkBinding__Group_3__04608);
            rule__TosNetLinkBinding__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group_3__1_in_rule__TosNetLinkBinding__Group_3__04611);
            rule__TosNetLinkBinding__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group_3__0"


    // $ANTLR start "rule__TosNetLinkBinding__Group_3__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2280:1: rule__TosNetLinkBinding__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TosNetLinkBinding__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2284:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2285:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2285:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2286:1: ','
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__TosNetLinkBinding__Group_3__0__Impl4639); 
             after(grammarAccess.getTosNetLinkBindingAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group_3__0__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group_3__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2299:1: rule__TosNetLinkBinding__Group_3__1 : rule__TosNetLinkBinding__Group_3__1__Impl ;
    public final void rule__TosNetLinkBinding__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2303:1: ( rule__TosNetLinkBinding__Group_3__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2304:2: rule__TosNetLinkBinding__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group_3__1__Impl_in_rule__TosNetLinkBinding__Group_3__14670);
            rule__TosNetLinkBinding__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group_3__1"


    // $ANTLR start "rule__TosNetLinkBinding__Group_3__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2310:1: rule__TosNetLinkBinding__Group_3__1__Impl : ( ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 ) ) ;
    public final void rule__TosNetLinkBinding__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2314:1: ( ( ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2315:1: ( ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2315:1: ( ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2316:1: ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getPropertiesAssignment_3_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2317:1: ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2317:2: rule__TosNetLinkBinding__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__PropertiesAssignment_3_1_in_rule__TosNetLinkBinding__Group_3__1__Impl4697);
            rule__TosNetLinkBinding__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTosNetLinkBindingAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group_3__1__Impl"


    // $ANTLR start "rule__LinkProperty__Group_0__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2331:1: rule__LinkProperty__Group_0__0 : rule__LinkProperty__Group_0__0__Impl rule__LinkProperty__Group_0__1 ;
    public final void rule__LinkProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2335:1: ( rule__LinkProperty__Group_0__0__Impl rule__LinkProperty__Group_0__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2336:2: rule__LinkProperty__Group_0__0__Impl rule__LinkProperty__Group_0__1
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_0__0__Impl_in_rule__LinkProperty__Group_0__04731);
            rule__LinkProperty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_0__1_in_rule__LinkProperty__Group_0__04734);
            rule__LinkProperty__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__0"


    // $ANTLR start "rule__LinkProperty__Group_0__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2343:1: rule__LinkProperty__Group_0__0__Impl : ( 'CTRL' ) ;
    public final void rule__LinkProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2347:1: ( ( 'CTRL' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2348:1: ( 'CTRL' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2348:1: ( 'CTRL' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2349:1: 'CTRL'
            {
             before(grammarAccess.getLinkPropertyAccess().getCTRLKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__LinkProperty__Group_0__0__Impl4762); 
             after(grammarAccess.getLinkPropertyAccess().getCTRLKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__0__Impl"


    // $ANTLR start "rule__LinkProperty__Group_0__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2362:1: rule__LinkProperty__Group_0__1 : rule__LinkProperty__Group_0__1__Impl rule__LinkProperty__Group_0__2 ;
    public final void rule__LinkProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2366:1: ( rule__LinkProperty__Group_0__1__Impl rule__LinkProperty__Group_0__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2367:2: rule__LinkProperty__Group_0__1__Impl rule__LinkProperty__Group_0__2
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_0__1__Impl_in_rule__LinkProperty__Group_0__14793);
            rule__LinkProperty__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_0__2_in_rule__LinkProperty__Group_0__14796);
            rule__LinkProperty__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__1"


    // $ANTLR start "rule__LinkProperty__Group_0__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2374:1: rule__LinkProperty__Group_0__1__Impl : ( '=' ) ;
    public final void rule__LinkProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2378:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2379:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2379:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2380:1: '='
            {
             before(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_0_1()); 
            match(input,26,FOLLOW_26_in_rule__LinkProperty__Group_0__1__Impl4824); 
             after(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__1__Impl"


    // $ANTLR start "rule__LinkProperty__Group_0__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2393:1: rule__LinkProperty__Group_0__2 : rule__LinkProperty__Group_0__2__Impl ;
    public final void rule__LinkProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2397:1: ( rule__LinkProperty__Group_0__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2398:2: rule__LinkProperty__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_0__2__Impl_in_rule__LinkProperty__Group_0__24855);
            rule__LinkProperty__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__2"


    // $ANTLR start "rule__LinkProperty__Group_0__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2404:1: rule__LinkProperty__Group_0__2__Impl : ( ( rule__LinkProperty__CtrlNameAssignment_0_2 ) ) ;
    public final void rule__LinkProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2408:1: ( ( ( rule__LinkProperty__CtrlNameAssignment_0_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2409:1: ( ( rule__LinkProperty__CtrlNameAssignment_0_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2409:1: ( ( rule__LinkProperty__CtrlNameAssignment_0_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2410:1: ( rule__LinkProperty__CtrlNameAssignment_0_2 )
            {
             before(grammarAccess.getLinkPropertyAccess().getCtrlNameAssignment_0_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2411:1: ( rule__LinkProperty__CtrlNameAssignment_0_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2411:2: rule__LinkProperty__CtrlNameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__LinkProperty__CtrlNameAssignment_0_2_in_rule__LinkProperty__Group_0__2__Impl4882);
            rule__LinkProperty__CtrlNameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkPropertyAccess().getCtrlNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__2__Impl"


    // $ANTLR start "rule__LinkProperty__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2427:1: rule__LinkProperty__Group_1__0 : rule__LinkProperty__Group_1__0__Impl rule__LinkProperty__Group_1__1 ;
    public final void rule__LinkProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2431:1: ( rule__LinkProperty__Group_1__0__Impl rule__LinkProperty__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2432:2: rule__LinkProperty__Group_1__0__Impl rule__LinkProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_1__0__Impl_in_rule__LinkProperty__Group_1__04918);
            rule__LinkProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_1__1_in_rule__LinkProperty__Group_1__04921);
            rule__LinkProperty__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__0"


    // $ANTLR start "rule__LinkProperty__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2439:1: rule__LinkProperty__Group_1__0__Impl : ( 'BASE' ) ;
    public final void rule__LinkProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2443:1: ( ( 'BASE' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2444:1: ( 'BASE' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2444:1: ( 'BASE' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2445:1: 'BASE'
            {
             before(grammarAccess.getLinkPropertyAccess().getBASEKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__LinkProperty__Group_1__0__Impl4949); 
             after(grammarAccess.getLinkPropertyAccess().getBASEKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__0__Impl"


    // $ANTLR start "rule__LinkProperty__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2458:1: rule__LinkProperty__Group_1__1 : rule__LinkProperty__Group_1__1__Impl rule__LinkProperty__Group_1__2 ;
    public final void rule__LinkProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2462:1: ( rule__LinkProperty__Group_1__1__Impl rule__LinkProperty__Group_1__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2463:2: rule__LinkProperty__Group_1__1__Impl rule__LinkProperty__Group_1__2
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_1__1__Impl_in_rule__LinkProperty__Group_1__14980);
            rule__LinkProperty__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_1__2_in_rule__LinkProperty__Group_1__14983);
            rule__LinkProperty__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__1"


    // $ANTLR start "rule__LinkProperty__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2470:1: rule__LinkProperty__Group_1__1__Impl : ( '=' ) ;
    public final void rule__LinkProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2474:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2475:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2475:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2476:1: '='
            {
             before(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__LinkProperty__Group_1__1__Impl5011); 
             after(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__1__Impl"


    // $ANTLR start "rule__LinkProperty__Group_1__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2489:1: rule__LinkProperty__Group_1__2 : rule__LinkProperty__Group_1__2__Impl ;
    public final void rule__LinkProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2493:1: ( rule__LinkProperty__Group_1__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2494:2: rule__LinkProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_1__2__Impl_in_rule__LinkProperty__Group_1__25042);
            rule__LinkProperty__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__2"


    // $ANTLR start "rule__LinkProperty__Group_1__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2500:1: rule__LinkProperty__Group_1__2__Impl : ( ( rule__LinkProperty__BaseValueAssignment_1_2 ) ) ;
    public final void rule__LinkProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2504:1: ( ( ( rule__LinkProperty__BaseValueAssignment_1_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2505:1: ( ( rule__LinkProperty__BaseValueAssignment_1_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2505:1: ( ( rule__LinkProperty__BaseValueAssignment_1_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2506:1: ( rule__LinkProperty__BaseValueAssignment_1_2 )
            {
             before(grammarAccess.getLinkPropertyAccess().getBaseValueAssignment_1_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2507:1: ( rule__LinkProperty__BaseValueAssignment_1_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2507:2: rule__LinkProperty__BaseValueAssignment_1_2
            {
            pushFollow(FOLLOW_rule__LinkProperty__BaseValueAssignment_1_2_in_rule__LinkProperty__Group_1__2__Impl5069);
            rule__LinkProperty__BaseValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkPropertyAccess().getBaseValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__2__Impl"


    // $ANTLR start "rule__LinkProperty__Group_2__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2523:1: rule__LinkProperty__Group_2__0 : rule__LinkProperty__Group_2__0__Impl rule__LinkProperty__Group_2__1 ;
    public final void rule__LinkProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2527:1: ( rule__LinkProperty__Group_2__0__Impl rule__LinkProperty__Group_2__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2528:2: rule__LinkProperty__Group_2__0__Impl rule__LinkProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_2__0__Impl_in_rule__LinkProperty__Group_2__05105);
            rule__LinkProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_2__1_in_rule__LinkProperty__Group_2__05108);
            rule__LinkProperty__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__0"


    // $ANTLR start "rule__LinkProperty__Group_2__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2535:1: rule__LinkProperty__Group_2__0__Impl : ( 'COMM' ) ;
    public final void rule__LinkProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2539:1: ( ( 'COMM' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2540:1: ( 'COMM' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2540:1: ( 'COMM' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2541:1: 'COMM'
            {
             before(grammarAccess.getLinkPropertyAccess().getCOMMKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__LinkProperty__Group_2__0__Impl5136); 
             after(grammarAccess.getLinkPropertyAccess().getCOMMKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__0__Impl"


    // $ANTLR start "rule__LinkProperty__Group_2__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2554:1: rule__LinkProperty__Group_2__1 : rule__LinkProperty__Group_2__1__Impl rule__LinkProperty__Group_2__2 ;
    public final void rule__LinkProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2558:1: ( rule__LinkProperty__Group_2__1__Impl rule__LinkProperty__Group_2__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2559:2: rule__LinkProperty__Group_2__1__Impl rule__LinkProperty__Group_2__2
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_2__1__Impl_in_rule__LinkProperty__Group_2__15167);
            rule__LinkProperty__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_2__2_in_rule__LinkProperty__Group_2__15170);
            rule__LinkProperty__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__1"


    // $ANTLR start "rule__LinkProperty__Group_2__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2566:1: rule__LinkProperty__Group_2__1__Impl : ( '=' ) ;
    public final void rule__LinkProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2570:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2571:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2571:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2572:1: '='
            {
             before(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_2_1()); 
            match(input,26,FOLLOW_26_in_rule__LinkProperty__Group_2__1__Impl5198); 
             after(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__1__Impl"


    // $ANTLR start "rule__LinkProperty__Group_2__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2585:1: rule__LinkProperty__Group_2__2 : rule__LinkProperty__Group_2__2__Impl ;
    public final void rule__LinkProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2589:1: ( rule__LinkProperty__Group_2__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2590:2: rule__LinkProperty__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_2__2__Impl_in_rule__LinkProperty__Group_2__25229);
            rule__LinkProperty__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__2"


    // $ANTLR start "rule__LinkProperty__Group_2__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2596:1: rule__LinkProperty__Group_2__2__Impl : ( ( rule__LinkProperty__UartNameAssignment_2_2 ) ) ;
    public final void rule__LinkProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2600:1: ( ( ( rule__LinkProperty__UartNameAssignment_2_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2601:1: ( ( rule__LinkProperty__UartNameAssignment_2_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2601:1: ( ( rule__LinkProperty__UartNameAssignment_2_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2602:1: ( rule__LinkProperty__UartNameAssignment_2_2 )
            {
             before(grammarAccess.getLinkPropertyAccess().getUartNameAssignment_2_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2603:1: ( rule__LinkProperty__UartNameAssignment_2_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2603:2: rule__LinkProperty__UartNameAssignment_2_2
            {
            pushFollow(FOLLOW_rule__LinkProperty__UartNameAssignment_2_2_in_rule__LinkProperty__Group_2__2__Impl5256);
            rule__LinkProperty__UartNameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkPropertyAccess().getUartNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__2__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2619:1: rule__SimpleExpansion__Group__0 : rule__SimpleExpansion__Group__0__Impl rule__SimpleExpansion__Group__1 ;
    public final void rule__SimpleExpansion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2623:1: ( rule__SimpleExpansion__Group__0__Impl rule__SimpleExpansion__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2624:2: rule__SimpleExpansion__Group__0__Impl rule__SimpleExpansion__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__0__Impl_in_rule__SimpleExpansion__Group__05292);
            rule__SimpleExpansion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__1_in_rule__SimpleExpansion__Group__05295);
            rule__SimpleExpansion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__0"


    // $ANTLR start "rule__SimpleExpansion__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2631:1: rule__SimpleExpansion__Group__0__Impl : ( ( rule__SimpleExpansion__NameAssignment_0 ) ) ;
    public final void rule__SimpleExpansion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2635:1: ( ( ( rule__SimpleExpansion__NameAssignment_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2636:1: ( ( rule__SimpleExpansion__NameAssignment_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2636:1: ( ( rule__SimpleExpansion__NameAssignment_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2637:1: ( rule__SimpleExpansion__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getNameAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2638:1: ( rule__SimpleExpansion__NameAssignment_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2638:2: rule__SimpleExpansion__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__NameAssignment_0_in_rule__SimpleExpansion__Group__0__Impl5322);
            rule__SimpleExpansion__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2648:1: rule__SimpleExpansion__Group__1 : rule__SimpleExpansion__Group__1__Impl rule__SimpleExpansion__Group__2 ;
    public final void rule__SimpleExpansion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2652:1: ( rule__SimpleExpansion__Group__1__Impl rule__SimpleExpansion__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2653:2: rule__SimpleExpansion__Group__1__Impl rule__SimpleExpansion__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__1__Impl_in_rule__SimpleExpansion__Group__15352);
            rule__SimpleExpansion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__2_in_rule__SimpleExpansion__Group__15355);
            rule__SimpleExpansion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__1"


    // $ANTLR start "rule__SimpleExpansion__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2660:1: rule__SimpleExpansion__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleExpansion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2664:1: ( ( ':' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2665:1: ( ':' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2665:1: ( ':' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2666:1: ':'
            {
             before(grammarAccess.getSimpleExpansionAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__SimpleExpansion__Group__1__Impl5383); 
             after(grammarAccess.getSimpleExpansionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__1__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2679:1: rule__SimpleExpansion__Group__2 : rule__SimpleExpansion__Group__2__Impl rule__SimpleExpansion__Group__3 ;
    public final void rule__SimpleExpansion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2683:1: ( rule__SimpleExpansion__Group__2__Impl rule__SimpleExpansion__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2684:2: rule__SimpleExpansion__Group__2__Impl rule__SimpleExpansion__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__2__Impl_in_rule__SimpleExpansion__Group__25414);
            rule__SimpleExpansion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__3_in_rule__SimpleExpansion__Group__25417);
            rule__SimpleExpansion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__2"


    // $ANTLR start "rule__SimpleExpansion__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2691:1: rule__SimpleExpansion__Group__2__Impl : ( ( rule__SimpleExpansion__ConstructorAssignment_2 ) ) ;
    public final void rule__SimpleExpansion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2695:1: ( ( ( rule__SimpleExpansion__ConstructorAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2696:1: ( ( rule__SimpleExpansion__ConstructorAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2696:1: ( ( rule__SimpleExpansion__ConstructorAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2697:1: ( rule__SimpleExpansion__ConstructorAssignment_2 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getConstructorAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2698:1: ( rule__SimpleExpansion__ConstructorAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2698:2: rule__SimpleExpansion__ConstructorAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__ConstructorAssignment_2_in_rule__SimpleExpansion__Group__2__Impl5444);
            rule__SimpleExpansion__ConstructorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getConstructorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__2__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2708:1: rule__SimpleExpansion__Group__3 : rule__SimpleExpansion__Group__3__Impl rule__SimpleExpansion__Group__4 ;
    public final void rule__SimpleExpansion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2712:1: ( rule__SimpleExpansion__Group__3__Impl rule__SimpleExpansion__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2713:2: rule__SimpleExpansion__Group__3__Impl rule__SimpleExpansion__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__3__Impl_in_rule__SimpleExpansion__Group__35474);
            rule__SimpleExpansion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__4_in_rule__SimpleExpansion__Group__35477);
            rule__SimpleExpansion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__3"


    // $ANTLR start "rule__SimpleExpansion__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2720:1: rule__SimpleExpansion__Group__3__Impl : ( '(' ) ;
    public final void rule__SimpleExpansion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2724:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2725:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2725:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2726:1: '('
            {
             before(grammarAccess.getSimpleExpansionAccess().getLeftParenthesisKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__SimpleExpansion__Group__3__Impl5505); 
             after(grammarAccess.getSimpleExpansionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__3__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2739:1: rule__SimpleExpansion__Group__4 : rule__SimpleExpansion__Group__4__Impl rule__SimpleExpansion__Group__5 ;
    public final void rule__SimpleExpansion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2743:1: ( rule__SimpleExpansion__Group__4__Impl rule__SimpleExpansion__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2744:2: rule__SimpleExpansion__Group__4__Impl rule__SimpleExpansion__Group__5
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__4__Impl_in_rule__SimpleExpansion__Group__45536);
            rule__SimpleExpansion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__5_in_rule__SimpleExpansion__Group__45539);
            rule__SimpleExpansion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__4"


    // $ANTLR start "rule__SimpleExpansion__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2751:1: rule__SimpleExpansion__Group__4__Impl : ( ( rule__SimpleExpansion__Group_4__0 )? ) ;
    public final void rule__SimpleExpansion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2755:1: ( ( ( rule__SimpleExpansion__Group_4__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2756:1: ( ( rule__SimpleExpansion__Group_4__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2756:1: ( ( rule__SimpleExpansion__Group_4__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2757:1: ( rule__SimpleExpansion__Group_4__0 )?
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup_4()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2758:1: ( rule__SimpleExpansion__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2758:2: rule__SimpleExpansion__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SimpleExpansion__Group_4__0_in_rule__SimpleExpansion__Group__4__Impl5566);
                    rule__SimpleExpansion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleExpansionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__4__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2768:1: rule__SimpleExpansion__Group__5 : rule__SimpleExpansion__Group__5__Impl rule__SimpleExpansion__Group__6 ;
    public final void rule__SimpleExpansion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2772:1: ( rule__SimpleExpansion__Group__5__Impl rule__SimpleExpansion__Group__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2773:2: rule__SimpleExpansion__Group__5__Impl rule__SimpleExpansion__Group__6
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__5__Impl_in_rule__SimpleExpansion__Group__55597);
            rule__SimpleExpansion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__6_in_rule__SimpleExpansion__Group__55600);
            rule__SimpleExpansion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__5"


    // $ANTLR start "rule__SimpleExpansion__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2780:1: rule__SimpleExpansion__Group__5__Impl : ( ')' ) ;
    public final void rule__SimpleExpansion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2784:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2785:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2785:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2786:1: ')'
            {
             before(grammarAccess.getSimpleExpansionAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__SimpleExpansion__Group__5__Impl5628); 
             after(grammarAccess.getSimpleExpansionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__5__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2799:1: rule__SimpleExpansion__Group__6 : rule__SimpleExpansion__Group__6__Impl ;
    public final void rule__SimpleExpansion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2803:1: ( rule__SimpleExpansion__Group__6__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2804:2: rule__SimpleExpansion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__6__Impl_in_rule__SimpleExpansion__Group__65659);
            rule__SimpleExpansion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__6"


    // $ANTLR start "rule__SimpleExpansion__Group__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2810:1: rule__SimpleExpansion__Group__6__Impl : ( ( rule__SimpleExpansion__Group_6__0 )? ) ;
    public final void rule__SimpleExpansion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2814:1: ( ( ( rule__SimpleExpansion__Group_6__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2815:1: ( ( rule__SimpleExpansion__Group_6__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2815:1: ( ( rule__SimpleExpansion__Group_6__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2816:1: ( rule__SimpleExpansion__Group_6__0 )?
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup_6()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2817:1: ( rule__SimpleExpansion__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2817:2: rule__SimpleExpansion__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__SimpleExpansion__Group_6__0_in_rule__SimpleExpansion__Group__6__Impl5686);
                    rule__SimpleExpansion__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleExpansionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__6__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_4__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2841:1: rule__SimpleExpansion__Group_4__0 : rule__SimpleExpansion__Group_4__0__Impl rule__SimpleExpansion__Group_4__1 ;
    public final void rule__SimpleExpansion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2845:1: ( rule__SimpleExpansion__Group_4__0__Impl rule__SimpleExpansion__Group_4__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2846:2: rule__SimpleExpansion__Group_4__0__Impl rule__SimpleExpansion__Group_4__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4__0__Impl_in_rule__SimpleExpansion__Group_4__05731);
            rule__SimpleExpansion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4__1_in_rule__SimpleExpansion__Group_4__05734);
            rule__SimpleExpansion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4__0"


    // $ANTLR start "rule__SimpleExpansion__Group_4__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2853:1: rule__SimpleExpansion__Group_4__0__Impl : ( ( rule__SimpleExpansion__ArgumentsAssignment_4_0 ) ) ;
    public final void rule__SimpleExpansion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2857:1: ( ( ( rule__SimpleExpansion__ArgumentsAssignment_4_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2858:1: ( ( rule__SimpleExpansion__ArgumentsAssignment_4_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2858:1: ( ( rule__SimpleExpansion__ArgumentsAssignment_4_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2859:1: ( rule__SimpleExpansion__ArgumentsAssignment_4_0 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getArgumentsAssignment_4_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2860:1: ( rule__SimpleExpansion__ArgumentsAssignment_4_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2860:2: rule__SimpleExpansion__ArgumentsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__ArgumentsAssignment_4_0_in_rule__SimpleExpansion__Group_4__0__Impl5761);
            rule__SimpleExpansion__ArgumentsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getArgumentsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_4__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2870:1: rule__SimpleExpansion__Group_4__1 : rule__SimpleExpansion__Group_4__1__Impl ;
    public final void rule__SimpleExpansion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2874:1: ( rule__SimpleExpansion__Group_4__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2875:2: rule__SimpleExpansion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4__1__Impl_in_rule__SimpleExpansion__Group_4__15791);
            rule__SimpleExpansion__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4__1"


    // $ANTLR start "rule__SimpleExpansion__Group_4__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2881:1: rule__SimpleExpansion__Group_4__1__Impl : ( ( rule__SimpleExpansion__Group_4_1__0 )* ) ;
    public final void rule__SimpleExpansion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2885:1: ( ( ( rule__SimpleExpansion__Group_4_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2886:1: ( ( rule__SimpleExpansion__Group_4_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2886:1: ( ( rule__SimpleExpansion__Group_4_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2887:1: ( rule__SimpleExpansion__Group_4_1__0 )*
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup_4_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2888:1: ( rule__SimpleExpansion__Group_4_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2888:2: rule__SimpleExpansion__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleExpansion__Group_4_1__0_in_rule__SimpleExpansion__Group_4__1__Impl5818);
            	    rule__SimpleExpansion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSimpleExpansionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4__1__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_4_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2902:1: rule__SimpleExpansion__Group_4_1__0 : rule__SimpleExpansion__Group_4_1__0__Impl rule__SimpleExpansion__Group_4_1__1 ;
    public final void rule__SimpleExpansion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2906:1: ( rule__SimpleExpansion__Group_4_1__0__Impl rule__SimpleExpansion__Group_4_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2907:2: rule__SimpleExpansion__Group_4_1__0__Impl rule__SimpleExpansion__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4_1__0__Impl_in_rule__SimpleExpansion__Group_4_1__05853);
            rule__SimpleExpansion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4_1__1_in_rule__SimpleExpansion__Group_4_1__05856);
            rule__SimpleExpansion__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4_1__0"


    // $ANTLR start "rule__SimpleExpansion__Group_4_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2914:1: rule__SimpleExpansion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleExpansion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2918:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2919:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2919:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2920:1: ','
            {
             before(grammarAccess.getSimpleExpansionAccess().getCommaKeyword_4_1_0()); 
            match(input,21,FOLLOW_21_in_rule__SimpleExpansion__Group_4_1__0__Impl5884); 
             after(grammarAccess.getSimpleExpansionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4_1__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_4_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2933:1: rule__SimpleExpansion__Group_4_1__1 : rule__SimpleExpansion__Group_4_1__1__Impl ;
    public final void rule__SimpleExpansion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2937:1: ( rule__SimpleExpansion__Group_4_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2938:2: rule__SimpleExpansion__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4_1__1__Impl_in_rule__SimpleExpansion__Group_4_1__15915);
            rule__SimpleExpansion__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4_1__1"


    // $ANTLR start "rule__SimpleExpansion__Group_4_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2944:1: rule__SimpleExpansion__Group_4_1__1__Impl : ( ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 ) ) ;
    public final void rule__SimpleExpansion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2948:1: ( ( ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2949:1: ( ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2949:1: ( ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2950:1: ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getArgumentsAssignment_4_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2951:1: ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2951:2: rule__SimpleExpansion__ArgumentsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__ArgumentsAssignment_4_1_1_in_rule__SimpleExpansion__Group_4_1__1__Impl5942);
            rule__SimpleExpansion__ArgumentsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getArgumentsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4_1__1__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_6__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2965:1: rule__SimpleExpansion__Group_6__0 : rule__SimpleExpansion__Group_6__0__Impl rule__SimpleExpansion__Group_6__1 ;
    public final void rule__SimpleExpansion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2969:1: ( rule__SimpleExpansion__Group_6__0__Impl rule__SimpleExpansion__Group_6__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2970:2: rule__SimpleExpansion__Group_6__0__Impl rule__SimpleExpansion__Group_6__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6__0__Impl_in_rule__SimpleExpansion__Group_6__05976);
            rule__SimpleExpansion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6__1_in_rule__SimpleExpansion__Group_6__05979);
            rule__SimpleExpansion__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6__0"


    // $ANTLR start "rule__SimpleExpansion__Group_6__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2977:1: rule__SimpleExpansion__Group_6__0__Impl : ( ( rule__SimpleExpansion__BindingsAssignment_6_0 ) ) ;
    public final void rule__SimpleExpansion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2981:1: ( ( ( rule__SimpleExpansion__BindingsAssignment_6_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2982:1: ( ( rule__SimpleExpansion__BindingsAssignment_6_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2982:1: ( ( rule__SimpleExpansion__BindingsAssignment_6_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2983:1: ( rule__SimpleExpansion__BindingsAssignment_6_0 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getBindingsAssignment_6_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2984:1: ( rule__SimpleExpansion__BindingsAssignment_6_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2984:2: rule__SimpleExpansion__BindingsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__BindingsAssignment_6_0_in_rule__SimpleExpansion__Group_6__0__Impl6006);
            rule__SimpleExpansion__BindingsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getBindingsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_6__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2994:1: rule__SimpleExpansion__Group_6__1 : rule__SimpleExpansion__Group_6__1__Impl ;
    public final void rule__SimpleExpansion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2998:1: ( rule__SimpleExpansion__Group_6__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2999:2: rule__SimpleExpansion__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6__1__Impl_in_rule__SimpleExpansion__Group_6__16036);
            rule__SimpleExpansion__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6__1"


    // $ANTLR start "rule__SimpleExpansion__Group_6__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3005:1: rule__SimpleExpansion__Group_6__1__Impl : ( ( rule__SimpleExpansion__Group_6_1__0 )* ) ;
    public final void rule__SimpleExpansion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3009:1: ( ( ( rule__SimpleExpansion__Group_6_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3010:1: ( ( rule__SimpleExpansion__Group_6_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3010:1: ( ( rule__SimpleExpansion__Group_6_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3011:1: ( rule__SimpleExpansion__Group_6_1__0 )*
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup_6_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3012:1: ( rule__SimpleExpansion__Group_6_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3012:2: rule__SimpleExpansion__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleExpansion__Group_6_1__0_in_rule__SimpleExpansion__Group_6__1__Impl6063);
            	    rule__SimpleExpansion__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSimpleExpansionAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6__1__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_6_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3026:1: rule__SimpleExpansion__Group_6_1__0 : rule__SimpleExpansion__Group_6_1__0__Impl rule__SimpleExpansion__Group_6_1__1 ;
    public final void rule__SimpleExpansion__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3030:1: ( rule__SimpleExpansion__Group_6_1__0__Impl rule__SimpleExpansion__Group_6_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3031:2: rule__SimpleExpansion__Group_6_1__0__Impl rule__SimpleExpansion__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6_1__0__Impl_in_rule__SimpleExpansion__Group_6_1__06098);
            rule__SimpleExpansion__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6_1__1_in_rule__SimpleExpansion__Group_6_1__06101);
            rule__SimpleExpansion__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6_1__0"


    // $ANTLR start "rule__SimpleExpansion__Group_6_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3038:1: rule__SimpleExpansion__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleExpansion__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3042:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3043:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3043:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3044:1: ','
            {
             before(grammarAccess.getSimpleExpansionAccess().getCommaKeyword_6_1_0()); 
            match(input,21,FOLLOW_21_in_rule__SimpleExpansion__Group_6_1__0__Impl6129); 
             after(grammarAccess.getSimpleExpansionAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6_1__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_6_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3057:1: rule__SimpleExpansion__Group_6_1__1 : rule__SimpleExpansion__Group_6_1__1__Impl ;
    public final void rule__SimpleExpansion__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3061:1: ( rule__SimpleExpansion__Group_6_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3062:2: rule__SimpleExpansion__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6_1__1__Impl_in_rule__SimpleExpansion__Group_6_1__16160);
            rule__SimpleExpansion__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6_1__1"


    // $ANTLR start "rule__SimpleExpansion__Group_6_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3068:1: rule__SimpleExpansion__Group_6_1__1__Impl : ( ( rule__SimpleExpansion__BindingsAssignment_6_1_1 ) ) ;
    public final void rule__SimpleExpansion__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3072:1: ( ( ( rule__SimpleExpansion__BindingsAssignment_6_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3073:1: ( ( rule__SimpleExpansion__BindingsAssignment_6_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3073:1: ( ( rule__SimpleExpansion__BindingsAssignment_6_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3074:1: ( rule__SimpleExpansion__BindingsAssignment_6_1_1 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getBindingsAssignment_6_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3075:1: ( rule__SimpleExpansion__BindingsAssignment_6_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3075:2: rule__SimpleExpansion__BindingsAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__BindingsAssignment_6_1_1_in_rule__SimpleExpansion__Group_6_1__1__Impl6187);
            rule__SimpleExpansion__BindingsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getBindingsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6_1__1__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3089:1: rule__AddressExpansion__Group__0 : rule__AddressExpansion__Group__0__Impl rule__AddressExpansion__Group__1 ;
    public final void rule__AddressExpansion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3093:1: ( rule__AddressExpansion__Group__0__Impl rule__AddressExpansion__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3094:2: rule__AddressExpansion__Group__0__Impl rule__AddressExpansion__Group__1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__0__Impl_in_rule__AddressExpansion__Group__06221);
            rule__AddressExpansion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__1_in_rule__AddressExpansion__Group__06224);
            rule__AddressExpansion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__0"


    // $ANTLR start "rule__AddressExpansion__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3101:1: rule__AddressExpansion__Group__0__Impl : ( '@' ) ;
    public final void rule__AddressExpansion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3105:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3106:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3106:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3107:1: '@'
            {
             before(grammarAccess.getAddressExpansionAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__AddressExpansion__Group__0__Impl6252); 
             after(grammarAccess.getAddressExpansionAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__0__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3120:1: rule__AddressExpansion__Group__1 : rule__AddressExpansion__Group__1__Impl rule__AddressExpansion__Group__2 ;
    public final void rule__AddressExpansion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3124:1: ( rule__AddressExpansion__Group__1__Impl rule__AddressExpansion__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3125:2: rule__AddressExpansion__Group__1__Impl rule__AddressExpansion__Group__2
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__1__Impl_in_rule__AddressExpansion__Group__16283);
            rule__AddressExpansion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__2_in_rule__AddressExpansion__Group__16286);
            rule__AddressExpansion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__1"


    // $ANTLR start "rule__AddressExpansion__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3132:1: rule__AddressExpansion__Group__1__Impl : ( ( rule__AddressExpansion__NameAssignment_1 ) ) ;
    public final void rule__AddressExpansion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3136:1: ( ( ( rule__AddressExpansion__NameAssignment_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3137:1: ( ( rule__AddressExpansion__NameAssignment_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3137:1: ( ( rule__AddressExpansion__NameAssignment_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3138:1: ( rule__AddressExpansion__NameAssignment_1 )
            {
             before(grammarAccess.getAddressExpansionAccess().getNameAssignment_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3139:1: ( rule__AddressExpansion__NameAssignment_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3139:2: rule__AddressExpansion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__NameAssignment_1_in_rule__AddressExpansion__Group__1__Impl6313);
            rule__AddressExpansion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__1__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3149:1: rule__AddressExpansion__Group__2 : rule__AddressExpansion__Group__2__Impl rule__AddressExpansion__Group__3 ;
    public final void rule__AddressExpansion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3153:1: ( rule__AddressExpansion__Group__2__Impl rule__AddressExpansion__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3154:2: rule__AddressExpansion__Group__2__Impl rule__AddressExpansion__Group__3
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__2__Impl_in_rule__AddressExpansion__Group__26343);
            rule__AddressExpansion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__3_in_rule__AddressExpansion__Group__26346);
            rule__AddressExpansion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__2"


    // $ANTLR start "rule__AddressExpansion__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3161:1: rule__AddressExpansion__Group__2__Impl : ( ':' ) ;
    public final void rule__AddressExpansion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3165:1: ( ( ':' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3166:1: ( ':' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3166:1: ( ':' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3167:1: ':'
            {
             before(grammarAccess.getAddressExpansionAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__AddressExpansion__Group__2__Impl6374); 
             after(grammarAccess.getAddressExpansionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__2__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3180:1: rule__AddressExpansion__Group__3 : rule__AddressExpansion__Group__3__Impl rule__AddressExpansion__Group__4 ;
    public final void rule__AddressExpansion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3184:1: ( rule__AddressExpansion__Group__3__Impl rule__AddressExpansion__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3185:2: rule__AddressExpansion__Group__3__Impl rule__AddressExpansion__Group__4
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__3__Impl_in_rule__AddressExpansion__Group__36405);
            rule__AddressExpansion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__4_in_rule__AddressExpansion__Group__36408);
            rule__AddressExpansion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__3"


    // $ANTLR start "rule__AddressExpansion__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3192:1: rule__AddressExpansion__Group__3__Impl : ( ( rule__AddressExpansion__ConstructorAssignment_3 ) ) ;
    public final void rule__AddressExpansion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3196:1: ( ( ( rule__AddressExpansion__ConstructorAssignment_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3197:1: ( ( rule__AddressExpansion__ConstructorAssignment_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3197:1: ( ( rule__AddressExpansion__ConstructorAssignment_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3198:1: ( rule__AddressExpansion__ConstructorAssignment_3 )
            {
             before(grammarAccess.getAddressExpansionAccess().getConstructorAssignment_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3199:1: ( rule__AddressExpansion__ConstructorAssignment_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3199:2: rule__AddressExpansion__ConstructorAssignment_3
            {
            pushFollow(FOLLOW_rule__AddressExpansion__ConstructorAssignment_3_in_rule__AddressExpansion__Group__3__Impl6435);
            rule__AddressExpansion__ConstructorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getConstructorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__3__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3209:1: rule__AddressExpansion__Group__4 : rule__AddressExpansion__Group__4__Impl rule__AddressExpansion__Group__5 ;
    public final void rule__AddressExpansion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3213:1: ( rule__AddressExpansion__Group__4__Impl rule__AddressExpansion__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3214:2: rule__AddressExpansion__Group__4__Impl rule__AddressExpansion__Group__5
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__4__Impl_in_rule__AddressExpansion__Group__46465);
            rule__AddressExpansion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__5_in_rule__AddressExpansion__Group__46468);
            rule__AddressExpansion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__4"


    // $ANTLR start "rule__AddressExpansion__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3221:1: rule__AddressExpansion__Group__4__Impl : ( '(' ) ;
    public final void rule__AddressExpansion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3225:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3226:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3226:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3227:1: '('
            {
             before(grammarAccess.getAddressExpansionAccess().getLeftParenthesisKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__AddressExpansion__Group__4__Impl6496); 
             after(grammarAccess.getAddressExpansionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__4__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3240:1: rule__AddressExpansion__Group__5 : rule__AddressExpansion__Group__5__Impl rule__AddressExpansion__Group__6 ;
    public final void rule__AddressExpansion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3244:1: ( rule__AddressExpansion__Group__5__Impl rule__AddressExpansion__Group__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3245:2: rule__AddressExpansion__Group__5__Impl rule__AddressExpansion__Group__6
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__5__Impl_in_rule__AddressExpansion__Group__56527);
            rule__AddressExpansion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__6_in_rule__AddressExpansion__Group__56530);
            rule__AddressExpansion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__5"


    // $ANTLR start "rule__AddressExpansion__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3252:1: rule__AddressExpansion__Group__5__Impl : ( ( rule__AddressExpansion__Group_5__0 )? ) ;
    public final void rule__AddressExpansion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3256:1: ( ( ( rule__AddressExpansion__Group_5__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3257:1: ( ( rule__AddressExpansion__Group_5__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3257:1: ( ( rule__AddressExpansion__Group_5__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3258:1: ( rule__AddressExpansion__Group_5__0 )?
            {
             before(grammarAccess.getAddressExpansionAccess().getGroup_5()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3259:1: ( rule__AddressExpansion__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3259:2: rule__AddressExpansion__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AddressExpansion__Group_5__0_in_rule__AddressExpansion__Group__5__Impl6557);
                    rule__AddressExpansion__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressExpansionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__5__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3269:1: rule__AddressExpansion__Group__6 : rule__AddressExpansion__Group__6__Impl ;
    public final void rule__AddressExpansion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3273:1: ( rule__AddressExpansion__Group__6__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3274:2: rule__AddressExpansion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__6__Impl_in_rule__AddressExpansion__Group__66588);
            rule__AddressExpansion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__6"


    // $ANTLR start "rule__AddressExpansion__Group__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3280:1: rule__AddressExpansion__Group__6__Impl : ( ')' ) ;
    public final void rule__AddressExpansion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3284:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3285:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3285:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3286:1: ')'
            {
             before(grammarAccess.getAddressExpansionAccess().getRightParenthesisKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__AddressExpansion__Group__6__Impl6616); 
             after(grammarAccess.getAddressExpansionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__6__Impl"


    // $ANTLR start "rule__AddressExpansion__Group_5__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3313:1: rule__AddressExpansion__Group_5__0 : rule__AddressExpansion__Group_5__0__Impl rule__AddressExpansion__Group_5__1 ;
    public final void rule__AddressExpansion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3317:1: ( rule__AddressExpansion__Group_5__0__Impl rule__AddressExpansion__Group_5__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3318:2: rule__AddressExpansion__Group_5__0__Impl rule__AddressExpansion__Group_5__1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group_5__0__Impl_in_rule__AddressExpansion__Group_5__06661);
            rule__AddressExpansion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group_5__1_in_rule__AddressExpansion__Group_5__06664);
            rule__AddressExpansion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5__0"


    // $ANTLR start "rule__AddressExpansion__Group_5__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3325:1: rule__AddressExpansion__Group_5__0__Impl : ( ( rule__AddressExpansion__ArgumentsAssignment_5_0 ) ) ;
    public final void rule__AddressExpansion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3329:1: ( ( ( rule__AddressExpansion__ArgumentsAssignment_5_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3330:1: ( ( rule__AddressExpansion__ArgumentsAssignment_5_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3330:1: ( ( rule__AddressExpansion__ArgumentsAssignment_5_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3331:1: ( rule__AddressExpansion__ArgumentsAssignment_5_0 )
            {
             before(grammarAccess.getAddressExpansionAccess().getArgumentsAssignment_5_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3332:1: ( rule__AddressExpansion__ArgumentsAssignment_5_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3332:2: rule__AddressExpansion__ArgumentsAssignment_5_0
            {
            pushFollow(FOLLOW_rule__AddressExpansion__ArgumentsAssignment_5_0_in_rule__AddressExpansion__Group_5__0__Impl6691);
            rule__AddressExpansion__ArgumentsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getArgumentsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5__0__Impl"


    // $ANTLR start "rule__AddressExpansion__Group_5__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3342:1: rule__AddressExpansion__Group_5__1 : rule__AddressExpansion__Group_5__1__Impl ;
    public final void rule__AddressExpansion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3346:1: ( rule__AddressExpansion__Group_5__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3347:2: rule__AddressExpansion__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group_5__1__Impl_in_rule__AddressExpansion__Group_5__16721);
            rule__AddressExpansion__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5__1"


    // $ANTLR start "rule__AddressExpansion__Group_5__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3353:1: rule__AddressExpansion__Group_5__1__Impl : ( ( rule__AddressExpansion__Group_5_1__0 )* ) ;
    public final void rule__AddressExpansion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3357:1: ( ( ( rule__AddressExpansion__Group_5_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3358:1: ( ( rule__AddressExpansion__Group_5_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3358:1: ( ( rule__AddressExpansion__Group_5_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3359:1: ( rule__AddressExpansion__Group_5_1__0 )*
            {
             before(grammarAccess.getAddressExpansionAccess().getGroup_5_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3360:1: ( rule__AddressExpansion__Group_5_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3360:2: rule__AddressExpansion__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddressExpansion__Group_5_1__0_in_rule__AddressExpansion__Group_5__1__Impl6748);
            	    rule__AddressExpansion__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAddressExpansionAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5__1__Impl"


    // $ANTLR start "rule__AddressExpansion__Group_5_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3374:1: rule__AddressExpansion__Group_5_1__0 : rule__AddressExpansion__Group_5_1__0__Impl rule__AddressExpansion__Group_5_1__1 ;
    public final void rule__AddressExpansion__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3378:1: ( rule__AddressExpansion__Group_5_1__0__Impl rule__AddressExpansion__Group_5_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3379:2: rule__AddressExpansion__Group_5_1__0__Impl rule__AddressExpansion__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group_5_1__0__Impl_in_rule__AddressExpansion__Group_5_1__06783);
            rule__AddressExpansion__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group_5_1__1_in_rule__AddressExpansion__Group_5_1__06786);
            rule__AddressExpansion__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5_1__0"


    // $ANTLR start "rule__AddressExpansion__Group_5_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3386:1: rule__AddressExpansion__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__AddressExpansion__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3390:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3391:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3391:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3392:1: ','
            {
             before(grammarAccess.getAddressExpansionAccess().getCommaKeyword_5_1_0()); 
            match(input,21,FOLLOW_21_in_rule__AddressExpansion__Group_5_1__0__Impl6814); 
             after(grammarAccess.getAddressExpansionAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5_1__0__Impl"


    // $ANTLR start "rule__AddressExpansion__Group_5_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3405:1: rule__AddressExpansion__Group_5_1__1 : rule__AddressExpansion__Group_5_1__1__Impl ;
    public final void rule__AddressExpansion__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3409:1: ( rule__AddressExpansion__Group_5_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3410:2: rule__AddressExpansion__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group_5_1__1__Impl_in_rule__AddressExpansion__Group_5_1__16845);
            rule__AddressExpansion__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5_1__1"


    // $ANTLR start "rule__AddressExpansion__Group_5_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3416:1: rule__AddressExpansion__Group_5_1__1__Impl : ( ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 ) ) ;
    public final void rule__AddressExpansion__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3420:1: ( ( ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3421:1: ( ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3421:1: ( ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3422:1: ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 )
            {
             before(grammarAccess.getAddressExpansionAccess().getArgumentsAssignment_5_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3423:1: ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3423:2: rule__AddressExpansion__ArgumentsAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__ArgumentsAssignment_5_1_1_in_rule__AddressExpansion__Group_5_1__1__Impl6872);
            rule__AddressExpansion__ArgumentsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getArgumentsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5_1__1__Impl"


    // $ANTLR start "rule__Argument__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3437:1: rule__Argument__Group_1__0 : rule__Argument__Group_1__0__Impl rule__Argument__Group_1__1 ;
    public final void rule__Argument__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3441:1: ( rule__Argument__Group_1__0__Impl rule__Argument__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3442:2: rule__Argument__Group_1__0__Impl rule__Argument__Group_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_1__0__Impl_in_rule__Argument__Group_1__06906);
            rule__Argument__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_1__1_in_rule__Argument__Group_1__06909);
            rule__Argument__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__0"


    // $ANTLR start "rule__Argument__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3449:1: rule__Argument__Group_1__0__Impl : ( ( rule__Argument__LhsAssignment_1_0 ) ) ;
    public final void rule__Argument__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3453:1: ( ( ( rule__Argument__LhsAssignment_1_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3454:1: ( ( rule__Argument__LhsAssignment_1_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3454:1: ( ( rule__Argument__LhsAssignment_1_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3455:1: ( rule__Argument__LhsAssignment_1_0 )
            {
             before(grammarAccess.getArgumentAccess().getLhsAssignment_1_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3456:1: ( rule__Argument__LhsAssignment_1_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3456:2: rule__Argument__LhsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Argument__LhsAssignment_1_0_in_rule__Argument__Group_1__0__Impl6936);
            rule__Argument__LhsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getLhsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__0__Impl"


    // $ANTLR start "rule__Argument__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3466:1: rule__Argument__Group_1__1 : rule__Argument__Group_1__1__Impl rule__Argument__Group_1__2 ;
    public final void rule__Argument__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3470:1: ( rule__Argument__Group_1__1__Impl rule__Argument__Group_1__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3471:2: rule__Argument__Group_1__1__Impl rule__Argument__Group_1__2
            {
            pushFollow(FOLLOW_rule__Argument__Group_1__1__Impl_in_rule__Argument__Group_1__16966);
            rule__Argument__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_1__2_in_rule__Argument__Group_1__16969);
            rule__Argument__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__1"


    // $ANTLR start "rule__Argument__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3478:1: rule__Argument__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Argument__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3482:1: ( ( '+' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3483:1: ( '+' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3483:1: ( '+' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3484:1: '+'
            {
             before(grammarAccess.getArgumentAccess().getPlusSignKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__Argument__Group_1__1__Impl6997); 
             after(grammarAccess.getArgumentAccess().getPlusSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__1__Impl"


    // $ANTLR start "rule__Argument__Group_1__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3497:1: rule__Argument__Group_1__2 : rule__Argument__Group_1__2__Impl ;
    public final void rule__Argument__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3501:1: ( rule__Argument__Group_1__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3502:2: rule__Argument__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_1__2__Impl_in_rule__Argument__Group_1__27028);
            rule__Argument__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__2"


    // $ANTLR start "rule__Argument__Group_1__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3508:1: rule__Argument__Group_1__2__Impl : ( ( rule__Argument__RhsAssignment_1_2 ) ) ;
    public final void rule__Argument__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3512:1: ( ( ( rule__Argument__RhsAssignment_1_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3513:1: ( ( rule__Argument__RhsAssignment_1_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3513:1: ( ( rule__Argument__RhsAssignment_1_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3514:1: ( rule__Argument__RhsAssignment_1_2 )
            {
             before(grammarAccess.getArgumentAccess().getRhsAssignment_1_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3515:1: ( rule__Argument__RhsAssignment_1_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3515:2: rule__Argument__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Argument__RhsAssignment_1_2_in_rule__Argument__Group_1__2__Impl7055);
            rule__Argument__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getRhsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__2__Impl"


    // $ANTLR start "rule__AddressBinding__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3531:1: rule__AddressBinding__Group__0 : rule__AddressBinding__Group__0__Impl rule__AddressBinding__Group__1 ;
    public final void rule__AddressBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3535:1: ( rule__AddressBinding__Group__0__Impl rule__AddressBinding__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3536:2: rule__AddressBinding__Group__0__Impl rule__AddressBinding__Group__1
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__0__Impl_in_rule__AddressBinding__Group__07091);
            rule__AddressBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__1_in_rule__AddressBinding__Group__07094);
            rule__AddressBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__0"


    // $ANTLR start "rule__AddressBinding__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3543:1: rule__AddressBinding__Group__0__Impl : ( '@' ) ;
    public final void rule__AddressBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3547:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3548:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3548:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3549:1: '@'
            {
             before(grammarAccess.getAddressBindingAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__AddressBinding__Group__0__Impl7122); 
             after(grammarAccess.getAddressBindingAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__0__Impl"


    // $ANTLR start "rule__AddressBinding__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3562:1: rule__AddressBinding__Group__1 : rule__AddressBinding__Group__1__Impl rule__AddressBinding__Group__2 ;
    public final void rule__AddressBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3566:1: ( rule__AddressBinding__Group__1__Impl rule__AddressBinding__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3567:2: rule__AddressBinding__Group__1__Impl rule__AddressBinding__Group__2
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__1__Impl_in_rule__AddressBinding__Group__17153);
            rule__AddressBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__2_in_rule__AddressBinding__Group__17156);
            rule__AddressBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__1"


    // $ANTLR start "rule__AddressBinding__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3574:1: rule__AddressBinding__Group__1__Impl : ( ( rule__AddressBinding__Group_1__0 )? ) ;
    public final void rule__AddressBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3578:1: ( ( ( rule__AddressBinding__Group_1__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3579:1: ( ( rule__AddressBinding__Group_1__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3579:1: ( ( rule__AddressBinding__Group_1__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3580:1: ( rule__AddressBinding__Group_1__0 )?
            {
             before(grammarAccess.getAddressBindingAccess().getGroup_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3581:1: ( rule__AddressBinding__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3581:2: rule__AddressBinding__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AddressBinding__Group_1__0_in_rule__AddressBinding__Group__1__Impl7183);
                    rule__AddressBinding__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressBindingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__1__Impl"


    // $ANTLR start "rule__AddressBinding__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3591:1: rule__AddressBinding__Group__2 : rule__AddressBinding__Group__2__Impl rule__AddressBinding__Group__3 ;
    public final void rule__AddressBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3595:1: ( rule__AddressBinding__Group__2__Impl rule__AddressBinding__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3596:2: rule__AddressBinding__Group__2__Impl rule__AddressBinding__Group__3
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__2__Impl_in_rule__AddressBinding__Group__27214);
            rule__AddressBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__3_in_rule__AddressBinding__Group__27217);
            rule__AddressBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__2"


    // $ANTLR start "rule__AddressBinding__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3603:1: rule__AddressBinding__Group__2__Impl : ( '(' ) ;
    public final void rule__AddressBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3607:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3608:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3608:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3609:1: '('
            {
             before(grammarAccess.getAddressBindingAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__AddressBinding__Group__2__Impl7245); 
             after(grammarAccess.getAddressBindingAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__2__Impl"


    // $ANTLR start "rule__AddressBinding__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3622:1: rule__AddressBinding__Group__3 : rule__AddressBinding__Group__3__Impl rule__AddressBinding__Group__4 ;
    public final void rule__AddressBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3626:1: ( rule__AddressBinding__Group__3__Impl rule__AddressBinding__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3627:2: rule__AddressBinding__Group__3__Impl rule__AddressBinding__Group__4
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__3__Impl_in_rule__AddressBinding__Group__37276);
            rule__AddressBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__4_in_rule__AddressBinding__Group__37279);
            rule__AddressBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__3"


    // $ANTLR start "rule__AddressBinding__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3634:1: rule__AddressBinding__Group__3__Impl : ( ( rule__AddressBinding__AddressesAssignment_3 ) ) ;
    public final void rule__AddressBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3638:1: ( ( ( rule__AddressBinding__AddressesAssignment_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3639:1: ( ( rule__AddressBinding__AddressesAssignment_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3639:1: ( ( rule__AddressBinding__AddressesAssignment_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3640:1: ( rule__AddressBinding__AddressesAssignment_3 )
            {
             before(grammarAccess.getAddressBindingAccess().getAddressesAssignment_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3641:1: ( rule__AddressBinding__AddressesAssignment_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3641:2: rule__AddressBinding__AddressesAssignment_3
            {
            pushFollow(FOLLOW_rule__AddressBinding__AddressesAssignment_3_in_rule__AddressBinding__Group__3__Impl7306);
            rule__AddressBinding__AddressesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddressBindingAccess().getAddressesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__3__Impl"


    // $ANTLR start "rule__AddressBinding__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3651:1: rule__AddressBinding__Group__4 : rule__AddressBinding__Group__4__Impl rule__AddressBinding__Group__5 ;
    public final void rule__AddressBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3655:1: ( rule__AddressBinding__Group__4__Impl rule__AddressBinding__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3656:2: rule__AddressBinding__Group__4__Impl rule__AddressBinding__Group__5
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__4__Impl_in_rule__AddressBinding__Group__47336);
            rule__AddressBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__5_in_rule__AddressBinding__Group__47339);
            rule__AddressBinding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__4"


    // $ANTLR start "rule__AddressBinding__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3663:1: rule__AddressBinding__Group__4__Impl : ( ( rule__AddressBinding__Group_4__0 )* ) ;
    public final void rule__AddressBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3667:1: ( ( ( rule__AddressBinding__Group_4__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3668:1: ( ( rule__AddressBinding__Group_4__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3668:1: ( ( rule__AddressBinding__Group_4__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3669:1: ( rule__AddressBinding__Group_4__0 )*
            {
             before(grammarAccess.getAddressBindingAccess().getGroup_4()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3670:1: ( rule__AddressBinding__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3670:2: rule__AddressBinding__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__AddressBinding__Group_4__0_in_rule__AddressBinding__Group__4__Impl7366);
            	    rule__AddressBinding__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getAddressBindingAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__4__Impl"


    // $ANTLR start "rule__AddressBinding__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3680:1: rule__AddressBinding__Group__5 : rule__AddressBinding__Group__5__Impl ;
    public final void rule__AddressBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3684:1: ( rule__AddressBinding__Group__5__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3685:2: rule__AddressBinding__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__5__Impl_in_rule__AddressBinding__Group__57397);
            rule__AddressBinding__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__5"


    // $ANTLR start "rule__AddressBinding__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3691:1: rule__AddressBinding__Group__5__Impl : ( ')' ) ;
    public final void rule__AddressBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3695:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3696:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3696:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3697:1: ')'
            {
             before(grammarAccess.getAddressBindingAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__AddressBinding__Group__5__Impl7425); 
             after(grammarAccess.getAddressBindingAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__5__Impl"


    // $ANTLR start "rule__AddressBinding__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3722:1: rule__AddressBinding__Group_1__0 : rule__AddressBinding__Group_1__0__Impl rule__AddressBinding__Group_1__1 ;
    public final void rule__AddressBinding__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3726:1: ( rule__AddressBinding__Group_1__0__Impl rule__AddressBinding__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3727:2: rule__AddressBinding__Group_1__0__Impl rule__AddressBinding__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group_1__0__Impl_in_rule__AddressBinding__Group_1__07468);
            rule__AddressBinding__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group_1__1_in_rule__AddressBinding__Group_1__07471);
            rule__AddressBinding__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_1__0"


    // $ANTLR start "rule__AddressBinding__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3734:1: rule__AddressBinding__Group_1__0__Impl : ( ( rule__AddressBinding__NameAssignment_1_0 ) ) ;
    public final void rule__AddressBinding__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3738:1: ( ( ( rule__AddressBinding__NameAssignment_1_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3739:1: ( ( rule__AddressBinding__NameAssignment_1_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3739:1: ( ( rule__AddressBinding__NameAssignment_1_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3740:1: ( rule__AddressBinding__NameAssignment_1_0 )
            {
             before(grammarAccess.getAddressBindingAccess().getNameAssignment_1_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3741:1: ( rule__AddressBinding__NameAssignment_1_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3741:2: rule__AddressBinding__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AddressBinding__NameAssignment_1_0_in_rule__AddressBinding__Group_1__0__Impl7498);
            rule__AddressBinding__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddressBindingAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_1__0__Impl"


    // $ANTLR start "rule__AddressBinding__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3751:1: rule__AddressBinding__Group_1__1 : rule__AddressBinding__Group_1__1__Impl ;
    public final void rule__AddressBinding__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3755:1: ( rule__AddressBinding__Group_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3756:2: rule__AddressBinding__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group_1__1__Impl_in_rule__AddressBinding__Group_1__17528);
            rule__AddressBinding__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_1__1"


    // $ANTLR start "rule__AddressBinding__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3762:1: rule__AddressBinding__Group_1__1__Impl : ( '=' ) ;
    public final void rule__AddressBinding__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3766:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3767:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3767:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3768:1: '='
            {
             before(grammarAccess.getAddressBindingAccess().getEqualsSignKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__AddressBinding__Group_1__1__Impl7556); 
             after(grammarAccess.getAddressBindingAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_1__1__Impl"


    // $ANTLR start "rule__AddressBinding__Group_4__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3785:1: rule__AddressBinding__Group_4__0 : rule__AddressBinding__Group_4__0__Impl rule__AddressBinding__Group_4__1 ;
    public final void rule__AddressBinding__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3789:1: ( rule__AddressBinding__Group_4__0__Impl rule__AddressBinding__Group_4__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3790:2: rule__AddressBinding__Group_4__0__Impl rule__AddressBinding__Group_4__1
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group_4__0__Impl_in_rule__AddressBinding__Group_4__07591);
            rule__AddressBinding__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group_4__1_in_rule__AddressBinding__Group_4__07594);
            rule__AddressBinding__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_4__0"


    // $ANTLR start "rule__AddressBinding__Group_4__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3797:1: rule__AddressBinding__Group_4__0__Impl : ( ',' ) ;
    public final void rule__AddressBinding__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3801:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3802:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3802:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3803:1: ','
            {
             before(grammarAccess.getAddressBindingAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__AddressBinding__Group_4__0__Impl7622); 
             after(grammarAccess.getAddressBindingAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_4__0__Impl"


    // $ANTLR start "rule__AddressBinding__Group_4__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3816:1: rule__AddressBinding__Group_4__1 : rule__AddressBinding__Group_4__1__Impl ;
    public final void rule__AddressBinding__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3820:1: ( rule__AddressBinding__Group_4__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3821:2: rule__AddressBinding__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group_4__1__Impl_in_rule__AddressBinding__Group_4__17653);
            rule__AddressBinding__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_4__1"


    // $ANTLR start "rule__AddressBinding__Group_4__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3827:1: rule__AddressBinding__Group_4__1__Impl : ( ( rule__AddressBinding__AddressesAssignment_4_1 ) ) ;
    public final void rule__AddressBinding__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3831:1: ( ( ( rule__AddressBinding__AddressesAssignment_4_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3832:1: ( ( rule__AddressBinding__AddressesAssignment_4_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3832:1: ( ( rule__AddressBinding__AddressesAssignment_4_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3833:1: ( rule__AddressBinding__AddressesAssignment_4_1 )
            {
             before(grammarAccess.getAddressBindingAccess().getAddressesAssignment_4_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3834:1: ( rule__AddressBinding__AddressesAssignment_4_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3834:2: rule__AddressBinding__AddressesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__AddressBinding__AddressesAssignment_4_1_in_rule__AddressBinding__Group_4__1__Impl7680);
            rule__AddressBinding__AddressesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressBindingAccess().getAddressesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_4__1__Impl"


    // $ANTLR start "rule__Instantiation__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3848:1: rule__Instantiation__Group__0 : rule__Instantiation__Group__0__Impl rule__Instantiation__Group__1 ;
    public final void rule__Instantiation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3852:1: ( rule__Instantiation__Group__0__Impl rule__Instantiation__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3853:2: rule__Instantiation__Group__0__Impl rule__Instantiation__Group__1
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__0__Impl_in_rule__Instantiation__Group__07714);
            rule__Instantiation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__1_in_rule__Instantiation__Group__07717);
            rule__Instantiation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__0"


    // $ANTLR start "rule__Instantiation__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3860:1: rule__Instantiation__Group__0__Impl : ( '@' ) ;
    public final void rule__Instantiation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3864:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3865:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3865:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3866:1: '@'
            {
             before(grammarAccess.getInstantiationAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Instantiation__Group__0__Impl7745); 
             after(grammarAccess.getInstantiationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__0__Impl"


    // $ANTLR start "rule__Instantiation__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3879:1: rule__Instantiation__Group__1 : rule__Instantiation__Group__1__Impl rule__Instantiation__Group__2 ;
    public final void rule__Instantiation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3883:1: ( rule__Instantiation__Group__1__Impl rule__Instantiation__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3884:2: rule__Instantiation__Group__1__Impl rule__Instantiation__Group__2
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__1__Impl_in_rule__Instantiation__Group__17776);
            rule__Instantiation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__2_in_rule__Instantiation__Group__17779);
            rule__Instantiation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__1"


    // $ANTLR start "rule__Instantiation__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3891:1: rule__Instantiation__Group__1__Impl : ( ( rule__Instantiation__AddressAssignment_1 ) ) ;
    public final void rule__Instantiation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3895:1: ( ( ( rule__Instantiation__AddressAssignment_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3896:1: ( ( rule__Instantiation__AddressAssignment_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3896:1: ( ( rule__Instantiation__AddressAssignment_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3897:1: ( rule__Instantiation__AddressAssignment_1 )
            {
             before(grammarAccess.getInstantiationAccess().getAddressAssignment_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3898:1: ( rule__Instantiation__AddressAssignment_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3898:2: rule__Instantiation__AddressAssignment_1
            {
            pushFollow(FOLLOW_rule__Instantiation__AddressAssignment_1_in_rule__Instantiation__Group__1__Impl7806);
            rule__Instantiation__AddressAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getAddressAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__1__Impl"


    // $ANTLR start "rule__Instantiation__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3908:1: rule__Instantiation__Group__2 : rule__Instantiation__Group__2__Impl rule__Instantiation__Group__3 ;
    public final void rule__Instantiation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3912:1: ( rule__Instantiation__Group__2__Impl rule__Instantiation__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3913:2: rule__Instantiation__Group__2__Impl rule__Instantiation__Group__3
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__2__Impl_in_rule__Instantiation__Group__27836);
            rule__Instantiation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__3_in_rule__Instantiation__Group__27839);
            rule__Instantiation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__2"


    // $ANTLR start "rule__Instantiation__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3920:1: rule__Instantiation__Group__2__Impl : ( ':' ) ;
    public final void rule__Instantiation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3924:1: ( ( ':' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3925:1: ( ':' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3925:1: ( ':' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3926:1: ':'
            {
             before(grammarAccess.getInstantiationAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Instantiation__Group__2__Impl7867); 
             after(grammarAccess.getInstantiationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__2__Impl"


    // $ANTLR start "rule__Instantiation__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3939:1: rule__Instantiation__Group__3 : rule__Instantiation__Group__3__Impl rule__Instantiation__Group__4 ;
    public final void rule__Instantiation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3943:1: ( rule__Instantiation__Group__3__Impl rule__Instantiation__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3944:2: rule__Instantiation__Group__3__Impl rule__Instantiation__Group__4
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__3__Impl_in_rule__Instantiation__Group__37898);
            rule__Instantiation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__4_in_rule__Instantiation__Group__37901);
            rule__Instantiation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__3"


    // $ANTLR start "rule__Instantiation__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3951:1: rule__Instantiation__Group__3__Impl : ( ( rule__Instantiation__KindAssignment_3 ) ) ;
    public final void rule__Instantiation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3955:1: ( ( ( rule__Instantiation__KindAssignment_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3956:1: ( ( rule__Instantiation__KindAssignment_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3956:1: ( ( rule__Instantiation__KindAssignment_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3957:1: ( rule__Instantiation__KindAssignment_3 )
            {
             before(grammarAccess.getInstantiationAccess().getKindAssignment_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3958:1: ( rule__Instantiation__KindAssignment_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3958:2: rule__Instantiation__KindAssignment_3
            {
            pushFollow(FOLLOW_rule__Instantiation__KindAssignment_3_in_rule__Instantiation__Group__3__Impl7928);
            rule__Instantiation__KindAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getKindAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__3__Impl"


    // $ANTLR start "rule__Instantiation__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3968:1: rule__Instantiation__Group__4 : rule__Instantiation__Group__4__Impl rule__Instantiation__Group__5 ;
    public final void rule__Instantiation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3972:1: ( rule__Instantiation__Group__4__Impl rule__Instantiation__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3973:2: rule__Instantiation__Group__4__Impl rule__Instantiation__Group__5
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__4__Impl_in_rule__Instantiation__Group__47958);
            rule__Instantiation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__5_in_rule__Instantiation__Group__47961);
            rule__Instantiation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__4"


    // $ANTLR start "rule__Instantiation__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3980:1: rule__Instantiation__Group__4__Impl : ( '(' ) ;
    public final void rule__Instantiation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3984:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3985:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3985:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3986:1: '('
            {
             before(grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Instantiation__Group__4__Impl7989); 
             after(grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__4__Impl"


    // $ANTLR start "rule__Instantiation__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3999:1: rule__Instantiation__Group__5 : rule__Instantiation__Group__5__Impl rule__Instantiation__Group__6 ;
    public final void rule__Instantiation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4003:1: ( rule__Instantiation__Group__5__Impl rule__Instantiation__Group__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4004:2: rule__Instantiation__Group__5__Impl rule__Instantiation__Group__6
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__5__Impl_in_rule__Instantiation__Group__58020);
            rule__Instantiation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__6_in_rule__Instantiation__Group__58023);
            rule__Instantiation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__5"


    // $ANTLR start "rule__Instantiation__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4011:1: rule__Instantiation__Group__5__Impl : ( ( rule__Instantiation__Group_5__0 )? ) ;
    public final void rule__Instantiation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4015:1: ( ( ( rule__Instantiation__Group_5__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4016:1: ( ( rule__Instantiation__Group_5__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4016:1: ( ( rule__Instantiation__Group_5__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4017:1: ( rule__Instantiation__Group_5__0 )?
            {
             before(grammarAccess.getInstantiationAccess().getGroup_5()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4018:1: ( rule__Instantiation__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=30 && LA28_0<=32)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4018:2: rule__Instantiation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Instantiation__Group_5__0_in_rule__Instantiation__Group__5__Impl8050);
                    rule__Instantiation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstantiationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__5__Impl"


    // $ANTLR start "rule__Instantiation__Group__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4028:1: rule__Instantiation__Group__6 : rule__Instantiation__Group__6__Impl ;
    public final void rule__Instantiation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4032:1: ( rule__Instantiation__Group__6__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4033:2: rule__Instantiation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__6__Impl_in_rule__Instantiation__Group__68081);
            rule__Instantiation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__6"


    // $ANTLR start "rule__Instantiation__Group__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4039:1: rule__Instantiation__Group__6__Impl : ( ')' ) ;
    public final void rule__Instantiation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4043:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4044:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4044:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4045:1: ')'
            {
             before(grammarAccess.getInstantiationAccess().getRightParenthesisKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Instantiation__Group__6__Impl8109); 
             after(grammarAccess.getInstantiationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__6__Impl"


    // $ANTLR start "rule__Instantiation__Group_5__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4072:1: rule__Instantiation__Group_5__0 : rule__Instantiation__Group_5__0__Impl rule__Instantiation__Group_5__1 ;
    public final void rule__Instantiation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4076:1: ( rule__Instantiation__Group_5__0__Impl rule__Instantiation__Group_5__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4077:2: rule__Instantiation__Group_5__0__Impl rule__Instantiation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Instantiation__Group_5__0__Impl_in_rule__Instantiation__Group_5__08154);
            rule__Instantiation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group_5__1_in_rule__Instantiation__Group_5__08157);
            rule__Instantiation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5__0"


    // $ANTLR start "rule__Instantiation__Group_5__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4084:1: rule__Instantiation__Group_5__0__Impl : ( ( rule__Instantiation__PropertiesAssignment_5_0 ) ) ;
    public final void rule__Instantiation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4088:1: ( ( ( rule__Instantiation__PropertiesAssignment_5_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4089:1: ( ( rule__Instantiation__PropertiesAssignment_5_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4089:1: ( ( rule__Instantiation__PropertiesAssignment_5_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4090:1: ( rule__Instantiation__PropertiesAssignment_5_0 )
            {
             before(grammarAccess.getInstantiationAccess().getPropertiesAssignment_5_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4091:1: ( rule__Instantiation__PropertiesAssignment_5_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4091:2: rule__Instantiation__PropertiesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Instantiation__PropertiesAssignment_5_0_in_rule__Instantiation__Group_5__0__Impl8184);
            rule__Instantiation__PropertiesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getPropertiesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5__0__Impl"


    // $ANTLR start "rule__Instantiation__Group_5__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4101:1: rule__Instantiation__Group_5__1 : rule__Instantiation__Group_5__1__Impl ;
    public final void rule__Instantiation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4105:1: ( rule__Instantiation__Group_5__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4106:2: rule__Instantiation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Instantiation__Group_5__1__Impl_in_rule__Instantiation__Group_5__18214);
            rule__Instantiation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5__1"


    // $ANTLR start "rule__Instantiation__Group_5__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4112:1: rule__Instantiation__Group_5__1__Impl : ( ( rule__Instantiation__Group_5_1__0 )* ) ;
    public final void rule__Instantiation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4116:1: ( ( ( rule__Instantiation__Group_5_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4117:1: ( ( rule__Instantiation__Group_5_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4117:1: ( ( rule__Instantiation__Group_5_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4118:1: ( rule__Instantiation__Group_5_1__0 )*
            {
             before(grammarAccess.getInstantiationAccess().getGroup_5_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4119:1: ( rule__Instantiation__Group_5_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4119:2: rule__Instantiation__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Instantiation__Group_5_1__0_in_rule__Instantiation__Group_5__1__Impl8241);
            	    rule__Instantiation__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getInstantiationAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5__1__Impl"


    // $ANTLR start "rule__Instantiation__Group_5_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4133:1: rule__Instantiation__Group_5_1__0 : rule__Instantiation__Group_5_1__0__Impl rule__Instantiation__Group_5_1__1 ;
    public final void rule__Instantiation__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4137:1: ( rule__Instantiation__Group_5_1__0__Impl rule__Instantiation__Group_5_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4138:2: rule__Instantiation__Group_5_1__0__Impl rule__Instantiation__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__Instantiation__Group_5_1__0__Impl_in_rule__Instantiation__Group_5_1__08276);
            rule__Instantiation__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group_5_1__1_in_rule__Instantiation__Group_5_1__08279);
            rule__Instantiation__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5_1__0"


    // $ANTLR start "rule__Instantiation__Group_5_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4145:1: rule__Instantiation__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Instantiation__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4149:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4150:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4150:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4151:1: ','
            {
             before(grammarAccess.getInstantiationAccess().getCommaKeyword_5_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Instantiation__Group_5_1__0__Impl8307); 
             after(grammarAccess.getInstantiationAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5_1__0__Impl"


    // $ANTLR start "rule__Instantiation__Group_5_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4164:1: rule__Instantiation__Group_5_1__1 : rule__Instantiation__Group_5_1__1__Impl ;
    public final void rule__Instantiation__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4168:1: ( rule__Instantiation__Group_5_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4169:2: rule__Instantiation__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Instantiation__Group_5_1__1__Impl_in_rule__Instantiation__Group_5_1__18338);
            rule__Instantiation__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5_1__1"


    // $ANTLR start "rule__Instantiation__Group_5_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4175:1: rule__Instantiation__Group_5_1__1__Impl : ( ( rule__Instantiation__PropertiesAssignment_5_1_1 ) ) ;
    public final void rule__Instantiation__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4179:1: ( ( ( rule__Instantiation__PropertiesAssignment_5_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4180:1: ( ( rule__Instantiation__PropertiesAssignment_5_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4180:1: ( ( rule__Instantiation__PropertiesAssignment_5_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4181:1: ( rule__Instantiation__PropertiesAssignment_5_1_1 )
            {
             before(grammarAccess.getInstantiationAccess().getPropertiesAssignment_5_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4182:1: ( rule__Instantiation__PropertiesAssignment_5_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4182:2: rule__Instantiation__PropertiesAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__Instantiation__PropertiesAssignment_5_1_1_in_rule__Instantiation__Group_5_1__1__Impl8365);
            rule__Instantiation__PropertiesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getPropertiesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5_1__1__Impl"


    // $ANTLR start "rule__DirectAddressSpec__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4196:1: rule__DirectAddressSpec__Group__0 : rule__DirectAddressSpec__Group__0__Impl rule__DirectAddressSpec__Group__1 ;
    public final void rule__DirectAddressSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4200:1: ( rule__DirectAddressSpec__Group__0__Impl rule__DirectAddressSpec__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4201:2: rule__DirectAddressSpec__Group__0__Impl rule__DirectAddressSpec__Group__1
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__0__Impl_in_rule__DirectAddressSpec__Group__08399);
            rule__DirectAddressSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__1_in_rule__DirectAddressSpec__Group__08402);
            rule__DirectAddressSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__0"


    // $ANTLR start "rule__DirectAddressSpec__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4208:1: rule__DirectAddressSpec__Group__0__Impl : ( ( rule__DirectAddressSpec__NameAssignment_0 ) ) ;
    public final void rule__DirectAddressSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4212:1: ( ( ( rule__DirectAddressSpec__NameAssignment_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4213:1: ( ( rule__DirectAddressSpec__NameAssignment_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4213:1: ( ( rule__DirectAddressSpec__NameAssignment_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4214:1: ( rule__DirectAddressSpec__NameAssignment_0 )
            {
             before(grammarAccess.getDirectAddressSpecAccess().getNameAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4215:1: ( rule__DirectAddressSpec__NameAssignment_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4215:2: rule__DirectAddressSpec__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__NameAssignment_0_in_rule__DirectAddressSpec__Group__0__Impl8429);
            rule__DirectAddressSpec__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectAddressSpecAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__0__Impl"


    // $ANTLR start "rule__DirectAddressSpec__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4225:1: rule__DirectAddressSpec__Group__1 : rule__DirectAddressSpec__Group__1__Impl rule__DirectAddressSpec__Group__2 ;
    public final void rule__DirectAddressSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4229:1: ( rule__DirectAddressSpec__Group__1__Impl rule__DirectAddressSpec__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4230:2: rule__DirectAddressSpec__Group__1__Impl rule__DirectAddressSpec__Group__2
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__1__Impl_in_rule__DirectAddressSpec__Group__18459);
            rule__DirectAddressSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__2_in_rule__DirectAddressSpec__Group__18462);
            rule__DirectAddressSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__1"


    // $ANTLR start "rule__DirectAddressSpec__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4237:1: rule__DirectAddressSpec__Group__1__Impl : ( '=' ) ;
    public final void rule__DirectAddressSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4241:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4242:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4242:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4243:1: '='
            {
             before(grammarAccess.getDirectAddressSpecAccess().getEqualsSignKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__DirectAddressSpec__Group__1__Impl8490); 
             after(grammarAccess.getDirectAddressSpecAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__1__Impl"


    // $ANTLR start "rule__DirectAddressSpec__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4256:1: rule__DirectAddressSpec__Group__2 : rule__DirectAddressSpec__Group__2__Impl ;
    public final void rule__DirectAddressSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4260:1: ( rule__DirectAddressSpec__Group__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4261:2: rule__DirectAddressSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__2__Impl_in_rule__DirectAddressSpec__Group__28521);
            rule__DirectAddressSpec__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__2"


    // $ANTLR start "rule__DirectAddressSpec__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4267:1: rule__DirectAddressSpec__Group__2__Impl : ( ( rule__DirectAddressSpec__AddressAssignment_2 ) ) ;
    public final void rule__DirectAddressSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4271:1: ( ( ( rule__DirectAddressSpec__AddressAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4272:1: ( ( rule__DirectAddressSpec__AddressAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4272:1: ( ( rule__DirectAddressSpec__AddressAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4273:1: ( rule__DirectAddressSpec__AddressAssignment_2 )
            {
             before(grammarAccess.getDirectAddressSpecAccess().getAddressAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4274:1: ( rule__DirectAddressSpec__AddressAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4274:2: rule__DirectAddressSpec__AddressAssignment_2
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__AddressAssignment_2_in_rule__DirectAddressSpec__Group__2__Impl8548);
            rule__DirectAddressSpec__AddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDirectAddressSpecAccess().getAddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__2__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_0__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4290:1: rule__InstantiationProperty__Group_0__0 : rule__InstantiationProperty__Group_0__0__Impl rule__InstantiationProperty__Group_0__1 ;
    public final void rule__InstantiationProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4294:1: ( rule__InstantiationProperty__Group_0__0__Impl rule__InstantiationProperty__Group_0__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4295:2: rule__InstantiationProperty__Group_0__0__Impl rule__InstantiationProperty__Group_0__1
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__0__Impl_in_rule__InstantiationProperty__Group_0__08584);
            rule__InstantiationProperty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__1_in_rule__InstantiationProperty__Group_0__08587);
            rule__InstantiationProperty__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__0"


    // $ANTLR start "rule__InstantiationProperty__Group_0__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4302:1: rule__InstantiationProperty__Group_0__0__Impl : ( () ) ;
    public final void rule__InstantiationProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4306:1: ( ( () ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4307:1: ( () )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4307:1: ( () )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4308:1: ()
            {
             before(grammarAccess.getInstantiationPropertyAccess().getIDPropertyAction_0_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4309:1: ()
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4311:1: 
            {
            }

             after(grammarAccess.getInstantiationPropertyAccess().getIDPropertyAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__0__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_0__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4321:1: rule__InstantiationProperty__Group_0__1 : rule__InstantiationProperty__Group_0__1__Impl rule__InstantiationProperty__Group_0__2 ;
    public final void rule__InstantiationProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4325:1: ( rule__InstantiationProperty__Group_0__1__Impl rule__InstantiationProperty__Group_0__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4326:2: rule__InstantiationProperty__Group_0__1__Impl rule__InstantiationProperty__Group_0__2
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__1__Impl_in_rule__InstantiationProperty__Group_0__18645);
            rule__InstantiationProperty__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__2_in_rule__InstantiationProperty__Group_0__18648);
            rule__InstantiationProperty__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__1"


    // $ANTLR start "rule__InstantiationProperty__Group_0__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4333:1: rule__InstantiationProperty__Group_0__1__Impl : ( 'ID' ) ;
    public final void rule__InstantiationProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4337:1: ( ( 'ID' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4338:1: ( 'ID' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4338:1: ( 'ID' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4339:1: 'ID'
            {
             before(grammarAccess.getInstantiationPropertyAccess().getIDKeyword_0_1()); 
            match(input,30,FOLLOW_30_in_rule__InstantiationProperty__Group_0__1__Impl8676); 
             after(grammarAccess.getInstantiationPropertyAccess().getIDKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__1__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_0__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4352:1: rule__InstantiationProperty__Group_0__2 : rule__InstantiationProperty__Group_0__2__Impl rule__InstantiationProperty__Group_0__3 ;
    public final void rule__InstantiationProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4356:1: ( rule__InstantiationProperty__Group_0__2__Impl rule__InstantiationProperty__Group_0__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4357:2: rule__InstantiationProperty__Group_0__2__Impl rule__InstantiationProperty__Group_0__3
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__2__Impl_in_rule__InstantiationProperty__Group_0__28707);
            rule__InstantiationProperty__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__3_in_rule__InstantiationProperty__Group_0__28710);
            rule__InstantiationProperty__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__2"


    // $ANTLR start "rule__InstantiationProperty__Group_0__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4364:1: rule__InstantiationProperty__Group_0__2__Impl : ( '=' ) ;
    public final void rule__InstantiationProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4368:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4369:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4369:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4370:1: '='
            {
             before(grammarAccess.getInstantiationPropertyAccess().getEqualsSignKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__InstantiationProperty__Group_0__2__Impl8738); 
             after(grammarAccess.getInstantiationPropertyAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__2__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_0__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4383:1: rule__InstantiationProperty__Group_0__3 : rule__InstantiationProperty__Group_0__3__Impl ;
    public final void rule__InstantiationProperty__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4387:1: ( rule__InstantiationProperty__Group_0__3__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4388:2: rule__InstantiationProperty__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__3__Impl_in_rule__InstantiationProperty__Group_0__38769);
            rule__InstantiationProperty__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__3"


    // $ANTLR start "rule__InstantiationProperty__Group_0__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4394:1: rule__InstantiationProperty__Group_0__3__Impl : ( ( rule__InstantiationProperty__IdAssignment_0_3 ) ) ;
    public final void rule__InstantiationProperty__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4398:1: ( ( ( rule__InstantiationProperty__IdAssignment_0_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4399:1: ( ( rule__InstantiationProperty__IdAssignment_0_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4399:1: ( ( rule__InstantiationProperty__IdAssignment_0_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4400:1: ( rule__InstantiationProperty__IdAssignment_0_3 )
            {
             before(grammarAccess.getInstantiationPropertyAccess().getIdAssignment_0_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4401:1: ( rule__InstantiationProperty__IdAssignment_0_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4401:2: rule__InstantiationProperty__IdAssignment_0_3
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__IdAssignment_0_3_in_rule__InstantiationProperty__Group_0__3__Impl8796);
            rule__InstantiationProperty__IdAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationPropertyAccess().getIdAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__3__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4419:1: rule__InstantiationProperty__Group_1__0 : rule__InstantiationProperty__Group_1__0__Impl rule__InstantiationProperty__Group_1__1 ;
    public final void rule__InstantiationProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4423:1: ( rule__InstantiationProperty__Group_1__0__Impl rule__InstantiationProperty__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4424:2: rule__InstantiationProperty__Group_1__0__Impl rule__InstantiationProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_1__0__Impl_in_rule__InstantiationProperty__Group_1__08834);
            rule__InstantiationProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_1__1_in_rule__InstantiationProperty__Group_1__08837);
            rule__InstantiationProperty__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_1__0"


    // $ANTLR start "rule__InstantiationProperty__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4431:1: rule__InstantiationProperty__Group_1__0__Impl : ( () ) ;
    public final void rule__InstantiationProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4435:1: ( ( () ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4436:1: ( () )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4436:1: ( () )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4437:1: ()
            {
             before(grammarAccess.getInstantiationPropertyAccess().getCRCPropertyAction_1_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4438:1: ()
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4440:1: 
            {
            }

             after(grammarAccess.getInstantiationPropertyAccess().getCRCPropertyAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_1__0__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4450:1: rule__InstantiationProperty__Group_1__1 : rule__InstantiationProperty__Group_1__1__Impl ;
    public final void rule__InstantiationProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4454:1: ( rule__InstantiationProperty__Group_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4455:2: rule__InstantiationProperty__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_1__1__Impl_in_rule__InstantiationProperty__Group_1__18895);
            rule__InstantiationProperty__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_1__1"


    // $ANTLR start "rule__InstantiationProperty__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4461:1: rule__InstantiationProperty__Group_1__1__Impl : ( 'CRC' ) ;
    public final void rule__InstantiationProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4465:1: ( ( 'CRC' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4466:1: ( 'CRC' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4466:1: ( 'CRC' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4467:1: 'CRC'
            {
             before(grammarAccess.getInstantiationPropertyAccess().getCRCKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__InstantiationProperty__Group_1__1__Impl8923); 
             after(grammarAccess.getInstantiationPropertyAccess().getCRCKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_1__1__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4484:1: rule__InstantiationProperty__Group_2__0 : rule__InstantiationProperty__Group_2__0__Impl rule__InstantiationProperty__Group_2__1 ;
    public final void rule__InstantiationProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4488:1: ( rule__InstantiationProperty__Group_2__0__Impl rule__InstantiationProperty__Group_2__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4489:2: rule__InstantiationProperty__Group_2__0__Impl rule__InstantiationProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__0__Impl_in_rule__InstantiationProperty__Group_2__08958);
            rule__InstantiationProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__1_in_rule__InstantiationProperty__Group_2__08961);
            rule__InstantiationProperty__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__0"


    // $ANTLR start "rule__InstantiationProperty__Group_2__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4496:1: rule__InstantiationProperty__Group_2__0__Impl : ( () ) ;
    public final void rule__InstantiationProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4500:1: ( ( () ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4501:1: ( () )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4501:1: ( () )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4502:1: ()
            {
             before(grammarAccess.getInstantiationPropertyAccess().getPublishPropertyAction_2_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4503:1: ()
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4505:1: 
            {
            }

             after(grammarAccess.getInstantiationPropertyAccess().getPublishPropertyAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__0__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4515:1: rule__InstantiationProperty__Group_2__1 : rule__InstantiationProperty__Group_2__1__Impl rule__InstantiationProperty__Group_2__2 ;
    public final void rule__InstantiationProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4519:1: ( rule__InstantiationProperty__Group_2__1__Impl rule__InstantiationProperty__Group_2__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4520:2: rule__InstantiationProperty__Group_2__1__Impl rule__InstantiationProperty__Group_2__2
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__1__Impl_in_rule__InstantiationProperty__Group_2__19019);
            rule__InstantiationProperty__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__2_in_rule__InstantiationProperty__Group_2__19022);
            rule__InstantiationProperty__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__1"


    // $ANTLR start "rule__InstantiationProperty__Group_2__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4527:1: rule__InstantiationProperty__Group_2__1__Impl : ( 'PUBLISH' ) ;
    public final void rule__InstantiationProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4531:1: ( ( 'PUBLISH' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4532:1: ( 'PUBLISH' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4532:1: ( 'PUBLISH' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4533:1: 'PUBLISH'
            {
             before(grammarAccess.getInstantiationPropertyAccess().getPUBLISHKeyword_2_1()); 
            match(input,32,FOLLOW_32_in_rule__InstantiationProperty__Group_2__1__Impl9050); 
             after(grammarAccess.getInstantiationPropertyAccess().getPUBLISHKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__1__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4546:1: rule__InstantiationProperty__Group_2__2 : rule__InstantiationProperty__Group_2__2__Impl rule__InstantiationProperty__Group_2__3 ;
    public final void rule__InstantiationProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4550:1: ( rule__InstantiationProperty__Group_2__2__Impl rule__InstantiationProperty__Group_2__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4551:2: rule__InstantiationProperty__Group_2__2__Impl rule__InstantiationProperty__Group_2__3
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__2__Impl_in_rule__InstantiationProperty__Group_2__29081);
            rule__InstantiationProperty__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__3_in_rule__InstantiationProperty__Group_2__29084);
            rule__InstantiationProperty__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__2"


    // $ANTLR start "rule__InstantiationProperty__Group_2__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4558:1: rule__InstantiationProperty__Group_2__2__Impl : ( '(' ) ;
    public final void rule__InstantiationProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4562:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4563:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4563:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4564:1: '('
            {
             before(grammarAccess.getInstantiationPropertyAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,17,FOLLOW_17_in_rule__InstantiationProperty__Group_2__2__Impl9112); 
             after(grammarAccess.getInstantiationPropertyAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__2__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4577:1: rule__InstantiationProperty__Group_2__3 : rule__InstantiationProperty__Group_2__3__Impl rule__InstantiationProperty__Group_2__4 ;
    public final void rule__InstantiationProperty__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4581:1: ( rule__InstantiationProperty__Group_2__3__Impl rule__InstantiationProperty__Group_2__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4582:2: rule__InstantiationProperty__Group_2__3__Impl rule__InstantiationProperty__Group_2__4
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__3__Impl_in_rule__InstantiationProperty__Group_2__39143);
            rule__InstantiationProperty__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__4_in_rule__InstantiationProperty__Group_2__39146);
            rule__InstantiationProperty__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__3"


    // $ANTLR start "rule__InstantiationProperty__Group_2__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4589:1: rule__InstantiationProperty__Group_2__3__Impl : ( ( rule__InstantiationProperty__ModeAssignment_2_3 ) ) ;
    public final void rule__InstantiationProperty__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4593:1: ( ( ( rule__InstantiationProperty__ModeAssignment_2_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4594:1: ( ( rule__InstantiationProperty__ModeAssignment_2_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4594:1: ( ( rule__InstantiationProperty__ModeAssignment_2_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4595:1: ( rule__InstantiationProperty__ModeAssignment_2_3 )
            {
             before(grammarAccess.getInstantiationPropertyAccess().getModeAssignment_2_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4596:1: ( rule__InstantiationProperty__ModeAssignment_2_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4596:2: rule__InstantiationProperty__ModeAssignment_2_3
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__ModeAssignment_2_3_in_rule__InstantiationProperty__Group_2__3__Impl9173);
            rule__InstantiationProperty__ModeAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationPropertyAccess().getModeAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__3__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4606:1: rule__InstantiationProperty__Group_2__4 : rule__InstantiationProperty__Group_2__4__Impl rule__InstantiationProperty__Group_2__5 ;
    public final void rule__InstantiationProperty__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4610:1: ( rule__InstantiationProperty__Group_2__4__Impl rule__InstantiationProperty__Group_2__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4611:2: rule__InstantiationProperty__Group_2__4__Impl rule__InstantiationProperty__Group_2__5
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__4__Impl_in_rule__InstantiationProperty__Group_2__49203);
            rule__InstantiationProperty__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__5_in_rule__InstantiationProperty__Group_2__49206);
            rule__InstantiationProperty__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__4"


    // $ANTLR start "rule__InstantiationProperty__Group_2__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4618:1: rule__InstantiationProperty__Group_2__4__Impl : ( ',' ) ;
    public final void rule__InstantiationProperty__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4622:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4623:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4623:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4624:1: ','
            {
             before(grammarAccess.getInstantiationPropertyAccess().getCommaKeyword_2_4()); 
            match(input,21,FOLLOW_21_in_rule__InstantiationProperty__Group_2__4__Impl9234); 
             after(grammarAccess.getInstantiationPropertyAccess().getCommaKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__4__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4637:1: rule__InstantiationProperty__Group_2__5 : rule__InstantiationProperty__Group_2__5__Impl rule__InstantiationProperty__Group_2__6 ;
    public final void rule__InstantiationProperty__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4641:1: ( rule__InstantiationProperty__Group_2__5__Impl rule__InstantiationProperty__Group_2__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4642:2: rule__InstantiationProperty__Group_2__5__Impl rule__InstantiationProperty__Group_2__6
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__5__Impl_in_rule__InstantiationProperty__Group_2__59265);
            rule__InstantiationProperty__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__6_in_rule__InstantiationProperty__Group_2__59268);
            rule__InstantiationProperty__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__5"


    // $ANTLR start "rule__InstantiationProperty__Group_2__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4649:1: rule__InstantiationProperty__Group_2__5__Impl : ( ( rule__InstantiationProperty__RateAssignment_2_5 ) ) ;
    public final void rule__InstantiationProperty__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4653:1: ( ( ( rule__InstantiationProperty__RateAssignment_2_5 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4654:1: ( ( rule__InstantiationProperty__RateAssignment_2_5 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4654:1: ( ( rule__InstantiationProperty__RateAssignment_2_5 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4655:1: ( rule__InstantiationProperty__RateAssignment_2_5 )
            {
             before(grammarAccess.getInstantiationPropertyAccess().getRateAssignment_2_5()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4656:1: ( rule__InstantiationProperty__RateAssignment_2_5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4656:2: rule__InstantiationProperty__RateAssignment_2_5
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__RateAssignment_2_5_in_rule__InstantiationProperty__Group_2__5__Impl9295);
            rule__InstantiationProperty__RateAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationPropertyAccess().getRateAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__5__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4666:1: rule__InstantiationProperty__Group_2__6 : rule__InstantiationProperty__Group_2__6__Impl ;
    public final void rule__InstantiationProperty__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4670:1: ( rule__InstantiationProperty__Group_2__6__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4671:2: rule__InstantiationProperty__Group_2__6__Impl
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__6__Impl_in_rule__InstantiationProperty__Group_2__69325);
            rule__InstantiationProperty__Group_2__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__6"


    // $ANTLR start "rule__InstantiationProperty__Group_2__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4677:1: rule__InstantiationProperty__Group_2__6__Impl : ( ')' ) ;
    public final void rule__InstantiationProperty__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4681:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4682:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4682:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4683:1: ')'
            {
             before(grammarAccess.getInstantiationPropertyAccess().getRightParenthesisKeyword_2_6()); 
            match(input,18,FOLLOW_18_in_rule__InstantiationProperty__Group_2__6__Impl9353); 
             after(grammarAccess.getInstantiationPropertyAccess().getRightParenthesisKeyword_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__6__Impl"


    // $ANTLR start "rule__Grouping__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4710:1: rule__Grouping__Group__0 : rule__Grouping__Group__0__Impl rule__Grouping__Group__1 ;
    public final void rule__Grouping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4714:1: ( rule__Grouping__Group__0__Impl rule__Grouping__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4715:2: rule__Grouping__Group__0__Impl rule__Grouping__Group__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__09398);
            rule__Grouping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__09401);
            rule__Grouping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__0"


    // $ANTLR start "rule__Grouping__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4722:1: rule__Grouping__Group__0__Impl : ( ( rule__Grouping__NameAssignment_0 ) ) ;
    public final void rule__Grouping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4726:1: ( ( ( rule__Grouping__NameAssignment_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4727:1: ( ( rule__Grouping__NameAssignment_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4727:1: ( ( rule__Grouping__NameAssignment_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4728:1: ( rule__Grouping__NameAssignment_0 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4729:1: ( rule__Grouping__NameAssignment_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4729:2: rule__Grouping__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_0_in_rule__Grouping__Group__0__Impl9428);
            rule__Grouping__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__0__Impl"


    // $ANTLR start "rule__Grouping__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4739:1: rule__Grouping__Group__1 : rule__Grouping__Group__1__Impl rule__Grouping__Group__2 ;
    public final void rule__Grouping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4743:1: ( rule__Grouping__Group__1__Impl rule__Grouping__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4744:2: rule__Grouping__Group__1__Impl rule__Grouping__Group__2
            {
            pushFollow(FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__19458);
            rule__Grouping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__19461);
            rule__Grouping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__1"


    // $ANTLR start "rule__Grouping__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4751:1: rule__Grouping__Group__1__Impl : ( '=' ) ;
    public final void rule__Grouping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4755:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4756:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4756:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4757:1: '='
            {
             before(grammarAccess.getGroupingAccess().getEqualsSignKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Grouping__Group__1__Impl9489); 
             after(grammarAccess.getGroupingAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__1__Impl"


    // $ANTLR start "rule__Grouping__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4770:1: rule__Grouping__Group__2 : rule__Grouping__Group__2__Impl rule__Grouping__Group__3 ;
    public final void rule__Grouping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4774:1: ( rule__Grouping__Group__2__Impl rule__Grouping__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4775:2: rule__Grouping__Group__2__Impl rule__Grouping__Group__3
            {
            pushFollow(FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__29520);
            rule__Grouping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__3_in_rule__Grouping__Group__29523);
            rule__Grouping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__2"


    // $ANTLR start "rule__Grouping__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4782:1: rule__Grouping__Group__2__Impl : ( ( rule__Grouping__ElementsAssignment_2 ) ) ;
    public final void rule__Grouping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4786:1: ( ( ( rule__Grouping__ElementsAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4787:1: ( ( rule__Grouping__ElementsAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4787:1: ( ( rule__Grouping__ElementsAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4788:1: ( rule__Grouping__ElementsAssignment_2 )
            {
             before(grammarAccess.getGroupingAccess().getElementsAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4789:1: ( rule__Grouping__ElementsAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4789:2: rule__Grouping__ElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__Grouping__ElementsAssignment_2_in_rule__Grouping__Group__2__Impl9550);
            rule__Grouping__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__2__Impl"


    // $ANTLR start "rule__Grouping__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4799:1: rule__Grouping__Group__3 : rule__Grouping__Group__3__Impl ;
    public final void rule__Grouping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4803:1: ( rule__Grouping__Group__3__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4804:2: rule__Grouping__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group__3__Impl_in_rule__Grouping__Group__39580);
            rule__Grouping__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__3"


    // $ANTLR start "rule__Grouping__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4810:1: rule__Grouping__Group__3__Impl : ( ( rule__Grouping__Group_3__0 )* ) ;
    public final void rule__Grouping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4814:1: ( ( ( rule__Grouping__Group_3__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4815:1: ( ( rule__Grouping__Group_3__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4815:1: ( ( rule__Grouping__Group_3__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4816:1: ( rule__Grouping__Group_3__0 )*
            {
             before(grammarAccess.getGroupingAccess().getGroup_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4817:1: ( rule__Grouping__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4817:2: rule__Grouping__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouping__Group_3__0_in_rule__Grouping__Group__3__Impl9607);
            	    rule__Grouping__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getGroupingAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__3__Impl"


    // $ANTLR start "rule__Grouping__Group_3__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4835:1: rule__Grouping__Group_3__0 : rule__Grouping__Group_3__0__Impl rule__Grouping__Group_3__1 ;
    public final void rule__Grouping__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4839:1: ( rule__Grouping__Group_3__0__Impl rule__Grouping__Group_3__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4840:2: rule__Grouping__Group_3__0__Impl rule__Grouping__Group_3__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group_3__0__Impl_in_rule__Grouping__Group_3__09646);
            rule__Grouping__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group_3__1_in_rule__Grouping__Group_3__09649);
            rule__Grouping__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_3__0"


    // $ANTLR start "rule__Grouping__Group_3__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4847:1: rule__Grouping__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Grouping__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4851:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4852:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4852:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4853:1: ','
            {
             before(grammarAccess.getGroupingAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Grouping__Group_3__0__Impl9677); 
             after(grammarAccess.getGroupingAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_3__0__Impl"


    // $ANTLR start "rule__Grouping__Group_3__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4866:1: rule__Grouping__Group_3__1 : rule__Grouping__Group_3__1__Impl ;
    public final void rule__Grouping__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4870:1: ( rule__Grouping__Group_3__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4871:2: rule__Grouping__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group_3__1__Impl_in_rule__Grouping__Group_3__19708);
            rule__Grouping__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_3__1"


    // $ANTLR start "rule__Grouping__Group_3__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4877:1: rule__Grouping__Group_3__1__Impl : ( ( rule__Grouping__ElementsAssignment_3_1 ) ) ;
    public final void rule__Grouping__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4881:1: ( ( ( rule__Grouping__ElementsAssignment_3_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4882:1: ( ( rule__Grouping__ElementsAssignment_3_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4882:1: ( ( rule__Grouping__ElementsAssignment_3_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4883:1: ( rule__Grouping__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getGroupingAccess().getElementsAssignment_3_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4884:1: ( rule__Grouping__ElementsAssignment_3_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4884:2: rule__Grouping__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Grouping__ElementsAssignment_3_1_in_rule__Grouping__Group_3__1__Impl9735);
            rule__Grouping__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_3__1__Impl"


    // $ANTLR start "rule__GroupElement__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4898:1: rule__GroupElement__Group__0 : rule__GroupElement__Group__0__Impl rule__GroupElement__Group__1 ;
    public final void rule__GroupElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4902:1: ( rule__GroupElement__Group__0__Impl rule__GroupElement__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4903:2: rule__GroupElement__Group__0__Impl rule__GroupElement__Group__1
            {
            pushFollow(FOLLOW_rule__GroupElement__Group__0__Impl_in_rule__GroupElement__Group__09769);
            rule__GroupElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupElement__Group__1_in_rule__GroupElement__Group__09772);
            rule__GroupElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group__0"


    // $ANTLR start "rule__GroupElement__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4910:1: rule__GroupElement__Group__0__Impl : ( ( rule__GroupElement__PathAssignment_0 ) ) ;
    public final void rule__GroupElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4914:1: ( ( ( rule__GroupElement__PathAssignment_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4915:1: ( ( rule__GroupElement__PathAssignment_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4915:1: ( ( rule__GroupElement__PathAssignment_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4916:1: ( rule__GroupElement__PathAssignment_0 )
            {
             before(grammarAccess.getGroupElementAccess().getPathAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4917:1: ( rule__GroupElement__PathAssignment_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4917:2: rule__GroupElement__PathAssignment_0
            {
            pushFollow(FOLLOW_rule__GroupElement__PathAssignment_0_in_rule__GroupElement__Group__0__Impl9799);
            rule__GroupElement__PathAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupElementAccess().getPathAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group__0__Impl"


    // $ANTLR start "rule__GroupElement__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4927:1: rule__GroupElement__Group__1 : rule__GroupElement__Group__1__Impl ;
    public final void rule__GroupElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4931:1: ( rule__GroupElement__Group__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4932:2: rule__GroupElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupElement__Group__1__Impl_in_rule__GroupElement__Group__19829);
            rule__GroupElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group__1"


    // $ANTLR start "rule__GroupElement__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4938:1: rule__GroupElement__Group__1__Impl : ( ( rule__GroupElement__Group_1__0 )* ) ;
    public final void rule__GroupElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4942:1: ( ( ( rule__GroupElement__Group_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4943:1: ( ( rule__GroupElement__Group_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4943:1: ( ( rule__GroupElement__Group_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4944:1: ( rule__GroupElement__Group_1__0 )*
            {
             before(grammarAccess.getGroupElementAccess().getGroup_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4945:1: ( rule__GroupElement__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4945:2: rule__GroupElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GroupElement__Group_1__0_in_rule__GroupElement__Group__1__Impl9856);
            	    rule__GroupElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getGroupElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group__1__Impl"


    // $ANTLR start "rule__GroupElement__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4959:1: rule__GroupElement__Group_1__0 : rule__GroupElement__Group_1__0__Impl rule__GroupElement__Group_1__1 ;
    public final void rule__GroupElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4963:1: ( rule__GroupElement__Group_1__0__Impl rule__GroupElement__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4964:2: rule__GroupElement__Group_1__0__Impl rule__GroupElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__GroupElement__Group_1__0__Impl_in_rule__GroupElement__Group_1__09891);
            rule__GroupElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupElement__Group_1__1_in_rule__GroupElement__Group_1__09894);
            rule__GroupElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group_1__0"


    // $ANTLR start "rule__GroupElement__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4971:1: rule__GroupElement__Group_1__0__Impl : ( '.' ) ;
    public final void rule__GroupElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4975:1: ( ( '.' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4976:1: ( '.' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4976:1: ( '.' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4977:1: '.'
            {
             before(grammarAccess.getGroupElementAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__GroupElement__Group_1__0__Impl9922); 
             after(grammarAccess.getGroupElementAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group_1__0__Impl"


    // $ANTLR start "rule__GroupElement__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4990:1: rule__GroupElement__Group_1__1 : rule__GroupElement__Group_1__1__Impl ;
    public final void rule__GroupElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4994:1: ( rule__GroupElement__Group_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4995:2: rule__GroupElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupElement__Group_1__1__Impl_in_rule__GroupElement__Group_1__19953);
            rule__GroupElement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group_1__1"


    // $ANTLR start "rule__GroupElement__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5001:1: rule__GroupElement__Group_1__1__Impl : ( ( rule__GroupElement__PathAssignment_1_1 ) ) ;
    public final void rule__GroupElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5005:1: ( ( ( rule__GroupElement__PathAssignment_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5006:1: ( ( rule__GroupElement__PathAssignment_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5006:1: ( ( rule__GroupElement__PathAssignment_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5007:1: ( rule__GroupElement__PathAssignment_1_1 )
            {
             before(grammarAccess.getGroupElementAccess().getPathAssignment_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5008:1: ( rule__GroupElement__PathAssignment_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5008:2: rule__GroupElement__PathAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GroupElement__PathAssignment_1_1_in_rule__GroupElement__Group_1__1__Impl9980);
            rule__GroupElement__PathAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupElementAccess().getPathAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group_1__1__Impl"


    // $ANTLR start "rule__PathElement__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5022:1: rule__PathElement__Group_1__0 : rule__PathElement__Group_1__0__Impl rule__PathElement__Group_1__1 ;
    public final void rule__PathElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5026:1: ( rule__PathElement__Group_1__0__Impl rule__PathElement__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5027:2: rule__PathElement__Group_1__0__Impl rule__PathElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__PathElement__Group_1__0__Impl_in_rule__PathElement__Group_1__010014);
            rule__PathElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathElement__Group_1__1_in_rule__PathElement__Group_1__010017);
            rule__PathElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__0"


    // $ANTLR start "rule__PathElement__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5034:1: rule__PathElement__Group_1__0__Impl : ( 'ALL' ) ;
    public final void rule__PathElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5038:1: ( ( 'ALL' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5039:1: ( 'ALL' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5039:1: ( 'ALL' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5040:1: 'ALL'
            {
             before(grammarAccess.getPathElementAccess().getALLKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__PathElement__Group_1__0__Impl10045); 
             after(grammarAccess.getPathElementAccess().getALLKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__0__Impl"


    // $ANTLR start "rule__PathElement__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5053:1: rule__PathElement__Group_1__1 : rule__PathElement__Group_1__1__Impl rule__PathElement__Group_1__2 ;
    public final void rule__PathElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5057:1: ( rule__PathElement__Group_1__1__Impl rule__PathElement__Group_1__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5058:2: rule__PathElement__Group_1__1__Impl rule__PathElement__Group_1__2
            {
            pushFollow(FOLLOW_rule__PathElement__Group_1__1__Impl_in_rule__PathElement__Group_1__110076);
            rule__PathElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathElement__Group_1__2_in_rule__PathElement__Group_1__110079);
            rule__PathElement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__1"


    // $ANTLR start "rule__PathElement__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5065:1: rule__PathElement__Group_1__1__Impl : ( '(' ) ;
    public final void rule__PathElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5069:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5070:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5070:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5071:1: '('
            {
             before(grammarAccess.getPathElementAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__PathElement__Group_1__1__Impl10107); 
             after(grammarAccess.getPathElementAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__1__Impl"


    // $ANTLR start "rule__PathElement__Group_1__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5084:1: rule__PathElement__Group_1__2 : rule__PathElement__Group_1__2__Impl rule__PathElement__Group_1__3 ;
    public final void rule__PathElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5088:1: ( rule__PathElement__Group_1__2__Impl rule__PathElement__Group_1__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5089:2: rule__PathElement__Group_1__2__Impl rule__PathElement__Group_1__3
            {
            pushFollow(FOLLOW_rule__PathElement__Group_1__2__Impl_in_rule__PathElement__Group_1__210138);
            rule__PathElement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathElement__Group_1__3_in_rule__PathElement__Group_1__210141);
            rule__PathElement__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__2"


    // $ANTLR start "rule__PathElement__Group_1__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5096:1: rule__PathElement__Group_1__2__Impl : ( ( rule__PathElement__TypeAssignment_1_2 ) ) ;
    public final void rule__PathElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5100:1: ( ( ( rule__PathElement__TypeAssignment_1_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5101:1: ( ( rule__PathElement__TypeAssignment_1_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5101:1: ( ( rule__PathElement__TypeAssignment_1_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5102:1: ( rule__PathElement__TypeAssignment_1_2 )
            {
             before(grammarAccess.getPathElementAccess().getTypeAssignment_1_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5103:1: ( rule__PathElement__TypeAssignment_1_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5103:2: rule__PathElement__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PathElement__TypeAssignment_1_2_in_rule__PathElement__Group_1__2__Impl10168);
            rule__PathElement__TypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPathElementAccess().getTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__2__Impl"


    // $ANTLR start "rule__PathElement__Group_1__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5113:1: rule__PathElement__Group_1__3 : rule__PathElement__Group_1__3__Impl ;
    public final void rule__PathElement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5117:1: ( rule__PathElement__Group_1__3__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5118:2: rule__PathElement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PathElement__Group_1__3__Impl_in_rule__PathElement__Group_1__310198);
            rule__PathElement__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__3"


    // $ANTLR start "rule__PathElement__Group_1__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5124:1: rule__PathElement__Group_1__3__Impl : ( ')' ) ;
    public final void rule__PathElement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5128:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5129:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5129:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5130:1: ')'
            {
             before(grammarAccess.getPathElementAccess().getRightParenthesisKeyword_1_3()); 
            match(input,18,FOLLOW_18_in_rule__PathElement__Group_1__3__Impl10226); 
             after(grammarAccess.getPathElementAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__3__Impl"


    // $ANTLR start "rule__LinkSpec__PackagenameAssignment_1_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5152:1: rule__LinkSpec__PackagenameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__LinkSpec__PackagenameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5156:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5157:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5157:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5158:1: RULE_ID
            {
             before(grammarAccess.getLinkSpecAccess().getPackagenameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkSpec__PackagenameAssignment_1_010270); 
             after(grammarAccess.getLinkSpecAccess().getPackagenameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__PackagenameAssignment_1_0"


    // $ANTLR start "rule__LinkSpec__NameAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5167:1: rule__LinkSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinkSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5171:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5172:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5172:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5173:1: RULE_ID
            {
             before(grammarAccess.getLinkSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkSpec__NameAssignment_210301); 
             after(grammarAccess.getLinkSpecAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__NameAssignment_2"


    // $ANTLR start "rule__LinkSpec__ConstructorsAssignment_4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5182:1: rule__LinkSpec__ConstructorsAssignment_4 : ( ruleConstructor ) ;
    public final void rule__LinkSpec__ConstructorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5186:1: ( ( ruleConstructor ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5187:1: ( ruleConstructor )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5187:1: ( ruleConstructor )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5188:1: ruleConstructor
            {
             before(grammarAccess.getLinkSpecAccess().getConstructorsConstructorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConstructor_in_rule__LinkSpec__ConstructorsAssignment_410332);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getLinkSpecAccess().getConstructorsConstructorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__ConstructorsAssignment_4"


    // $ANTLR start "rule__Constructor__IsPublicAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5197:1: rule__Constructor__IsPublicAssignment_0 : ( ( 'public' ) ) ;
    public final void rule__Constructor__IsPublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5201:1: ( ( ( 'public' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5202:1: ( ( 'public' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5202:1: ( ( 'public' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5203:1: ( 'public' )
            {
             before(grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5204:1: ( 'public' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5205:1: 'public'
            {
             before(grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Constructor__IsPublicAssignment_010368); 
             after(grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0()); 

            }

             after(grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__IsPublicAssignment_0"


    // $ANTLR start "rule__Constructor__NameAssignment_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5220:1: rule__Constructor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5224:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5225:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5225:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5226:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_110407); 
             after(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__NameAssignment_1"


    // $ANTLR start "rule__Constructor__ParametersAssignment_3_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5235:1: rule__Constructor__ParametersAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Constructor__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5239:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5240:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5240:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5241:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__ParametersAssignment_3_010438); 
             after(grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__ParametersAssignment_3_0"


    // $ANTLR start "rule__Constructor__ParametersAssignment_3_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5250:1: rule__Constructor__ParametersAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__Constructor__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5254:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5255:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5255:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5256:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__ParametersAssignment_3_1_110469); 
             after(grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__Constructor__AddressesAssignment_5_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5265:1: rule__Constructor__AddressesAssignment_5_1 : ( ruleConstructorAddressParameters ) ;
    public final void rule__Constructor__AddressesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5269:1: ( ( ruleConstructorAddressParameters ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5270:1: ( ruleConstructorAddressParameters )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5270:1: ( ruleConstructorAddressParameters )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5271:1: ruleConstructorAddressParameters
            {
             before(grammarAccess.getConstructorAccess().getAddressesConstructorAddressParametersParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleConstructorAddressParameters_in_rule__Constructor__AddressesAssignment_5_110500);
            ruleConstructorAddressParameters();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getAddressesConstructorAddressParametersParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__AddressesAssignment_5_1"


    // $ANTLR start "rule__Constructor__MembersAssignment_7_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5280:1: rule__Constructor__MembersAssignment_7_0 : ( ruleMember ) ;
    public final void rule__Constructor__MembersAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5284:1: ( ( ruleMember ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5285:1: ( ruleMember )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5285:1: ( ruleMember )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5286:1: ruleMember
            {
             before(grammarAccess.getConstructorAccess().getMembersMemberParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Constructor__MembersAssignment_7_010531);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getMembersMemberParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__MembersAssignment_7_0"


    // $ANTLR start "rule__NamedAddresses__AddressNamesAssignment_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5295:1: rule__NamedAddresses__AddressNamesAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedAddresses__AddressNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5299:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5300:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5300:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5301:1: RULE_ID
            {
             before(grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedAddresses__AddressNamesAssignment_110562); 
             after(grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__AddressNamesAssignment_1"


    // $ANTLR start "rule__NamedAddresses__AddressNamesAssignment_2_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5310:1: rule__NamedAddresses__AddressNamesAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__NamedAddresses__AddressNamesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5314:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5315:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5315:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5316:1: RULE_ID
            {
             before(grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedAddresses__AddressNamesAssignment_2_210593); 
             after(grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__AddressNamesAssignment_2_2"


    // $ANTLR start "rule__AddressTuple__ElementsAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5325:1: rule__AddressTuple__ElementsAssignment_2 : ( RULE_ID ) ;
    public final void rule__AddressTuple__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5329:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5330:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5330:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5331:1: RULE_ID
            {
             before(grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressTuple__ElementsAssignment_210624); 
             after(grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__ElementsAssignment_2"


    // $ANTLR start "rule__AddressTuple__ElementsAssignment_3_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5340:1: rule__AddressTuple__ElementsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__AddressTuple__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5344:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5345:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5345:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5346:1: RULE_ID
            {
             before(grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressTuple__ElementsAssignment_3_110655); 
             after(grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__ElementsAssignment_3_1"


    // $ANTLR start "rule__TosNetLinkBinding__PropertiesAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5355:1: rule__TosNetLinkBinding__PropertiesAssignment_2 : ( ruleLinkProperty ) ;
    public final void rule__TosNetLinkBinding__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5359:1: ( ( ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5360:1: ( ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5360:1: ( ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5361:1: ruleLinkProperty
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_rule__TosNetLinkBinding__PropertiesAssignment_210686);
            ruleLinkProperty();

            state._fsp--;

             after(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__PropertiesAssignment_2"


    // $ANTLR start "rule__TosNetLinkBinding__PropertiesAssignment_3_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5370:1: rule__TosNetLinkBinding__PropertiesAssignment_3_1 : ( ruleLinkProperty ) ;
    public final void rule__TosNetLinkBinding__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5374:1: ( ( ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5375:1: ( ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5375:1: ( ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5376:1: ruleLinkProperty
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_rule__TosNetLinkBinding__PropertiesAssignment_3_110717);
            ruleLinkProperty();

            state._fsp--;

             after(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__PropertiesAssignment_3_1"


    // $ANTLR start "rule__LinkProperty__CtrlNameAssignment_0_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5385:1: rule__LinkProperty__CtrlNameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__LinkProperty__CtrlNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5389:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5390:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5390:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5391:1: RULE_ID
            {
             before(grammarAccess.getLinkPropertyAccess().getCtrlNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkProperty__CtrlNameAssignment_0_210748); 
             after(grammarAccess.getLinkPropertyAccess().getCtrlNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__CtrlNameAssignment_0_2"


    // $ANTLR start "rule__LinkProperty__BaseValueAssignment_1_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5400:1: rule__LinkProperty__BaseValueAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__LinkProperty__BaseValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5404:1: ( ( RULE_INT ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5405:1: ( RULE_INT )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5405:1: ( RULE_INT )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5406:1: RULE_INT
            {
             before(grammarAccess.getLinkPropertyAccess().getBaseValueINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LinkProperty__BaseValueAssignment_1_210779); 
             after(grammarAccess.getLinkPropertyAccess().getBaseValueINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__BaseValueAssignment_1_2"


    // $ANTLR start "rule__LinkProperty__UartNameAssignment_2_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5415:1: rule__LinkProperty__UartNameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__LinkProperty__UartNameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5419:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5420:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5420:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5421:1: RULE_ID
            {
             before(grammarAccess.getLinkPropertyAccess().getUartNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkProperty__UartNameAssignment_2_210810); 
             after(grammarAccess.getLinkPropertyAccess().getUartNameIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__UartNameAssignment_2_2"


    // $ANTLR start "rule__SimpleExpansion__NameAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5430:1: rule__SimpleExpansion__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleExpansion__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5434:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5435:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5435:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5436:1: RULE_ID
            {
             before(grammarAccess.getSimpleExpansionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleExpansion__NameAssignment_010841); 
             after(grammarAccess.getSimpleExpansionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__NameAssignment_0"


    // $ANTLR start "rule__SimpleExpansion__ConstructorAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5445:1: rule__SimpleExpansion__ConstructorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleExpansion__ConstructorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5449:1: ( ( ( RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5450:1: ( ( RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5450:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5451:1: ( RULE_ID )
            {
             before(grammarAccess.getSimpleExpansionAccess().getConstructorConstructorCrossReference_2_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5452:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5453:1: RULE_ID
            {
             before(grammarAccess.getSimpleExpansionAccess().getConstructorConstructorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleExpansion__ConstructorAssignment_210876); 
             after(grammarAccess.getSimpleExpansionAccess().getConstructorConstructorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSimpleExpansionAccess().getConstructorConstructorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__ConstructorAssignment_2"


    // $ANTLR start "rule__SimpleExpansion__ArgumentsAssignment_4_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5464:1: rule__SimpleExpansion__ArgumentsAssignment_4_0 : ( ruleArgument ) ;
    public final void rule__SimpleExpansion__ArgumentsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5468:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5469:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5469:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5470:1: ruleArgument
            {
             before(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__SimpleExpansion__ArgumentsAssignment_4_010911);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__ArgumentsAssignment_4_0"


    // $ANTLR start "rule__SimpleExpansion__ArgumentsAssignment_4_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5479:1: rule__SimpleExpansion__ArgumentsAssignment_4_1_1 : ( ruleArgument ) ;
    public final void rule__SimpleExpansion__ArgumentsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5483:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5484:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5484:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5485:1: ruleArgument
            {
             before(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__SimpleExpansion__ArgumentsAssignment_4_1_110942);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__ArgumentsAssignment_4_1_1"


    // $ANTLR start "rule__SimpleExpansion__BindingsAssignment_6_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5494:1: rule__SimpleExpansion__BindingsAssignment_6_0 : ( ruleAddressBinding ) ;
    public final void rule__SimpleExpansion__BindingsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5498:1: ( ( ruleAddressBinding ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5499:1: ( ruleAddressBinding )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5499:1: ( ruleAddressBinding )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5500:1: ruleAddressBinding
            {
             before(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_rule__SimpleExpansion__BindingsAssignment_6_010973);
            ruleAddressBinding();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__BindingsAssignment_6_0"


    // $ANTLR start "rule__SimpleExpansion__BindingsAssignment_6_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5509:1: rule__SimpleExpansion__BindingsAssignment_6_1_1 : ( ruleAddressBinding ) ;
    public final void rule__SimpleExpansion__BindingsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5513:1: ( ( ruleAddressBinding ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5514:1: ( ruleAddressBinding )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5514:1: ( ruleAddressBinding )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5515:1: ruleAddressBinding
            {
             before(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_rule__SimpleExpansion__BindingsAssignment_6_1_111004);
            ruleAddressBinding();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__BindingsAssignment_6_1_1"


    // $ANTLR start "rule__AddressExpansion__NameAssignment_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5524:1: rule__AddressExpansion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddressExpansion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5528:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5529:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5529:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5530:1: RULE_ID
            {
             before(grammarAccess.getAddressExpansionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressExpansion__NameAssignment_111035); 
             after(grammarAccess.getAddressExpansionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__NameAssignment_1"


    // $ANTLR start "rule__AddressExpansion__ConstructorAssignment_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5539:1: rule__AddressExpansion__ConstructorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddressExpansion__ConstructorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5543:1: ( ( ( RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5544:1: ( ( RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5544:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5545:1: ( RULE_ID )
            {
             before(grammarAccess.getAddressExpansionAccess().getConstructorConstructorCrossReference_3_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5546:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5547:1: RULE_ID
            {
             before(grammarAccess.getAddressExpansionAccess().getConstructorConstructorIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressExpansion__ConstructorAssignment_311070); 
             after(grammarAccess.getAddressExpansionAccess().getConstructorConstructorIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAddressExpansionAccess().getConstructorConstructorCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__ConstructorAssignment_3"


    // $ANTLR start "rule__AddressExpansion__ArgumentsAssignment_5_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5558:1: rule__AddressExpansion__ArgumentsAssignment_5_0 : ( ruleArgument ) ;
    public final void rule__AddressExpansion__ArgumentsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5562:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5563:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5563:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5564:1: ruleArgument
            {
             before(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__AddressExpansion__ArgumentsAssignment_5_011105);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__ArgumentsAssignment_5_0"


    // $ANTLR start "rule__AddressExpansion__ArgumentsAssignment_5_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5573:1: rule__AddressExpansion__ArgumentsAssignment_5_1_1 : ( ruleArgument ) ;
    public final void rule__AddressExpansion__ArgumentsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5577:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5578:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5578:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5579:1: ruleArgument
            {
             before(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__AddressExpansion__ArgumentsAssignment_5_1_111136);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__ArgumentsAssignment_5_1_1"


    // $ANTLR start "rule__Argument__SimpleAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5588:1: rule__Argument__SimpleAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5592:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5593:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5593:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5594:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getSimpleIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__SimpleAssignment_011167); 
             after(grammarAccess.getArgumentAccess().getSimpleIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__SimpleAssignment_0"


    // $ANTLR start "rule__Argument__LhsAssignment_1_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5603:1: rule__Argument__LhsAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Argument__LhsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5607:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5608:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5608:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5609:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getLhsIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__LhsAssignment_1_011198); 
             after(grammarAccess.getArgumentAccess().getLhsIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__LhsAssignment_1_0"


    // $ANTLR start "rule__Argument__RhsAssignment_1_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5618:1: rule__Argument__RhsAssignment_1_2 : ( ruleArgument ) ;
    public final void rule__Argument__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5622:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5623:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5623:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5624:1: ruleArgument
            {
             before(grammarAccess.getArgumentAccess().getRhsArgumentParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Argument__RhsAssignment_1_211229);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentAccess().getRhsArgumentParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__RhsAssignment_1_2"


    // $ANTLR start "rule__Argument__TextAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5633:1: rule__Argument__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Argument__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5637:1: ( ( RULE_STRING ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5638:1: ( RULE_STRING )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5638:1: ( RULE_STRING )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5639:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__TextAssignment_211260); 
             after(grammarAccess.getArgumentAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__TextAssignment_2"


    // $ANTLR start "rule__AddressBinding__NameAssignment_1_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5648:1: rule__AddressBinding__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__AddressBinding__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5652:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5653:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5653:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5654:1: RULE_ID
            {
             before(grammarAccess.getAddressBindingAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressBinding__NameAssignment_1_011291); 
             after(grammarAccess.getAddressBindingAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__NameAssignment_1_0"


    // $ANTLR start "rule__AddressBinding__AddressesAssignment_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5663:1: rule__AddressBinding__AddressesAssignment_3 : ( RULE_HEX_NUM ) ;
    public final void rule__AddressBinding__AddressesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5667:1: ( ( RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5668:1: ( RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5668:1: ( RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5669:1: RULE_HEX_NUM
            {
             before(grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_3_0()); 
            match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_rule__AddressBinding__AddressesAssignment_311322); 
             after(grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__AddressesAssignment_3"


    // $ANTLR start "rule__AddressBinding__AddressesAssignment_4_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5678:1: rule__AddressBinding__AddressesAssignment_4_1 : ( RULE_HEX_NUM ) ;
    public final void rule__AddressBinding__AddressesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5682:1: ( ( RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5683:1: ( RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5683:1: ( RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5684:1: RULE_HEX_NUM
            {
             before(grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_4_1_0()); 
            match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_rule__AddressBinding__AddressesAssignment_4_111353); 
             after(grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__AddressesAssignment_4_1"


    // $ANTLR start "rule__Instantiation__AddressAssignment_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5693:1: rule__Instantiation__AddressAssignment_1 : ( ruleAddressSpec ) ;
    public final void rule__Instantiation__AddressAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5697:1: ( ( ruleAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5698:1: ( ruleAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5698:1: ( ruleAddressSpec )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5699:1: ruleAddressSpec
            {
             before(grammarAccess.getInstantiationAccess().getAddressAddressSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAddressSpec_in_rule__Instantiation__AddressAssignment_111384);
            ruleAddressSpec();

            state._fsp--;

             after(grammarAccess.getInstantiationAccess().getAddressAddressSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__AddressAssignment_1"


    // $ANTLR start "rule__Instantiation__KindAssignment_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5708:1: rule__Instantiation__KindAssignment_3 : ( ruleKind ) ;
    public final void rule__Instantiation__KindAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5712:1: ( ( ruleKind ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5713:1: ( ruleKind )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5713:1: ( ruleKind )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5714:1: ruleKind
            {
             before(grammarAccess.getInstantiationAccess().getKindKindParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleKind_in_rule__Instantiation__KindAssignment_311415);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getInstantiationAccess().getKindKindParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__KindAssignment_3"


    // $ANTLR start "rule__Instantiation__PropertiesAssignment_5_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5723:1: rule__Instantiation__PropertiesAssignment_5_0 : ( ruleInstantiationProperty ) ;
    public final void rule__Instantiation__PropertiesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5727:1: ( ( ruleInstantiationProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5728:1: ( ruleInstantiationProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5728:1: ( ruleInstantiationProperty )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5729:1: ruleInstantiationProperty
            {
             before(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_rule__Instantiation__PropertiesAssignment_5_011446);
            ruleInstantiationProperty();

            state._fsp--;

             after(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__PropertiesAssignment_5_0"


    // $ANTLR start "rule__Instantiation__PropertiesAssignment_5_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5738:1: rule__Instantiation__PropertiesAssignment_5_1_1 : ( ruleInstantiationProperty ) ;
    public final void rule__Instantiation__PropertiesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5742:1: ( ( ruleInstantiationProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5743:1: ( ruleInstantiationProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5743:1: ( ruleInstantiationProperty )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5744:1: ruleInstantiationProperty
            {
             before(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_rule__Instantiation__PropertiesAssignment_5_1_111477);
            ruleInstantiationProperty();

            state._fsp--;

             after(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__PropertiesAssignment_5_1_1"


    // $ANTLR start "rule__DirectAddressSpec__NameAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5753:1: rule__DirectAddressSpec__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DirectAddressSpec__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5757:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5758:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5758:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5759:1: RULE_ID
            {
             before(grammarAccess.getDirectAddressSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectAddressSpec__NameAssignment_011508); 
             after(grammarAccess.getDirectAddressSpecAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__NameAssignment_0"


    // $ANTLR start "rule__DirectAddressSpec__AddressAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5768:1: rule__DirectAddressSpec__AddressAssignment_2 : ( RULE_HEX_NUM ) ;
    public final void rule__DirectAddressSpec__AddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5772:1: ( ( RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5773:1: ( RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5773:1: ( RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5774:1: RULE_HEX_NUM
            {
             before(grammarAccess.getDirectAddressSpecAccess().getAddressHEX_NUMTerminalRuleCall_2_0()); 
            match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_rule__DirectAddressSpec__AddressAssignment_211539); 
             after(grammarAccess.getDirectAddressSpecAccess().getAddressHEX_NUMTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__AddressAssignment_2"


    // $ANTLR start "rule__NamedAddressSpec__NameAssignment"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5783:1: rule__NamedAddressSpec__NameAssignment : ( RULE_ID ) ;
    public final void rule__NamedAddressSpec__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5787:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5788:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5788:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5789:1: RULE_ID
            {
             before(grammarAccess.getNamedAddressSpecAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedAddressSpec__NameAssignment11570); 
             after(grammarAccess.getNamedAddressSpecAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddressSpec__NameAssignment"


    // $ANTLR start "rule__InstantiationProperty__IdAssignment_0_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5798:1: rule__InstantiationProperty__IdAssignment_0_3 : ( ruleArgument ) ;
    public final void rule__InstantiationProperty__IdAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5802:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5803:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5803:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5804:1: ruleArgument
            {
             before(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__InstantiationProperty__IdAssignment_0_311601);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__IdAssignment_0_3"


    // $ANTLR start "rule__InstantiationProperty__ModeAssignment_2_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5813:1: rule__InstantiationProperty__ModeAssignment_2_3 : ( RULE_INT ) ;
    public final void rule__InstantiationProperty__ModeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5817:1: ( ( RULE_INT ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5818:1: ( RULE_INT )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5818:1: ( RULE_INT )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5819:1: RULE_INT
            {
             before(grammarAccess.getInstantiationPropertyAccess().getModeINTTerminalRuleCall_2_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InstantiationProperty__ModeAssignment_2_311632); 
             after(grammarAccess.getInstantiationPropertyAccess().getModeINTTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__ModeAssignment_2_3"


    // $ANTLR start "rule__InstantiationProperty__RateAssignment_2_5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5828:1: rule__InstantiationProperty__RateAssignment_2_5 : ( RULE_INT ) ;
    public final void rule__InstantiationProperty__RateAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5832:1: ( ( RULE_INT ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5833:1: ( RULE_INT )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5833:1: ( RULE_INT )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5834:1: RULE_INT
            {
             before(grammarAccess.getInstantiationPropertyAccess().getRateINTTerminalRuleCall_2_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InstantiationProperty__RateAssignment_2_511663); 
             after(grammarAccess.getInstantiationPropertyAccess().getRateINTTerminalRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__RateAssignment_2_5"


    // $ANTLR start "rule__Grouping__NameAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5843:1: rule__Grouping__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Grouping__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5847:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5848:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5848:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5849:1: RULE_ID
            {
             before(grammarAccess.getGroupingAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Grouping__NameAssignment_011694); 
             after(grammarAccess.getGroupingAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__NameAssignment_0"


    // $ANTLR start "rule__Grouping__ElementsAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5858:1: rule__Grouping__ElementsAssignment_2 : ( ruleGroupElement ) ;
    public final void rule__Grouping__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5862:1: ( ( ruleGroupElement ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5863:1: ( ruleGroupElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5863:1: ( ruleGroupElement )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5864:1: ruleGroupElement
            {
             before(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupElement_in_rule__Grouping__ElementsAssignment_211725);
            ruleGroupElement();

            state._fsp--;

             after(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__ElementsAssignment_2"


    // $ANTLR start "rule__Grouping__ElementsAssignment_3_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5873:1: rule__Grouping__ElementsAssignment_3_1 : ( ruleGroupElement ) ;
    public final void rule__Grouping__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5877:1: ( ( ruleGroupElement ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5878:1: ( ruleGroupElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5878:1: ( ruleGroupElement )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5879:1: ruleGroupElement
            {
             before(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleGroupElement_in_rule__Grouping__ElementsAssignment_3_111756);
            ruleGroupElement();

            state._fsp--;

             after(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__ElementsAssignment_3_1"


    // $ANTLR start "rule__GroupElement__PathAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5888:1: rule__GroupElement__PathAssignment_0 : ( rulePathElement ) ;
    public final void rule__GroupElement__PathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5892:1: ( ( rulePathElement ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5893:1: ( rulePathElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5893:1: ( rulePathElement )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5894:1: rulePathElement
            {
             before(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePathElement_in_rule__GroupElement__PathAssignment_011787);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__PathAssignment_0"


    // $ANTLR start "rule__GroupElement__PathAssignment_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5903:1: rule__GroupElement__PathAssignment_1_1 : ( rulePathElement ) ;
    public final void rule__GroupElement__PathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5907:1: ( ( rulePathElement ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5908:1: ( rulePathElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5908:1: ( rulePathElement )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5909:1: rulePathElement
            {
             before(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePathElement_in_rule__GroupElement__PathAssignment_1_111818);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__PathAssignment_1_1"


    // $ANTLR start "rule__PathElement__SimpleAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5918:1: rule__PathElement__SimpleAssignment_0 : ( RULE_ID ) ;
    public final void rule__PathElement__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5922:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5923:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5923:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5924:1: RULE_ID
            {
             before(grammarAccess.getPathElementAccess().getSimpleIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathElement__SimpleAssignment_011849); 
             after(grammarAccess.getPathElementAccess().getSimpleIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__SimpleAssignment_0"


    // $ANTLR start "rule__PathElement__TypeAssignment_1_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5933:1: rule__PathElement__TypeAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__PathElement__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5937:1: ( ( ( RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5938:1: ( ( RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5938:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5939:1: ( RULE_ID )
            {
             before(grammarAccess.getPathElementAccess().getTypeConstructorCrossReference_1_2_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5940:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5941:1: RULE_ID
            {
             before(grammarAccess.getPathElementAccess().getTypeConstructorIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathElement__TypeAssignment_1_211884); 
             after(grammarAccess.getPathElementAccess().getTypeConstructorIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getPathElementAccess().getTypeConstructorCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__TypeAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLinkSpec_in_entryRuleLinkSpec61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkSpec68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__0_in_ruleLinkSpec94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0_in_ruleConstructor154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorAddressParameters_in_entryRuleConstructorAddressParameters181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructorAddressParameters188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorAddressParameters__Alternatives_in_ruleConstructorAddressParameters214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddresses_in_entryRuleNamedAddresses241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddresses248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__0_in_ruleNamedAddresses274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressTuple_in_entryRuleAddressTuple301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressTuple308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__0_in_ruleAddressTuple334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Alternatives_in_ruleMember394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkBinding428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTosNetLinkBinding487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__0_in_ruleTosNetLinkBinding513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkProperty547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Alternatives_in_ruleLinkProperty573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_entryRuleExpansion600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpansion607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expansion__Alternatives_in_ruleExpansion633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpansion667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__0_in_ruleSimpleExpansion693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressExpansion727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__0_in_ruleAddressExpansion753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Alternatives_in_ruleArgument813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressBinding847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__0_in_ruleAddressBinding873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__0_in_ruleInstantiation933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressSpec967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressSpec__Alternatives_in_ruleAddressSpec993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectAddressSpec1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__0_in_ruleDirectAddressSpec1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddressSpec1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddressSpec__NameAssignment_in_ruleNamedAddressSpec1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKind_in_entryRuleKind1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKind1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kind__Alternatives_in_ruleKind1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationProperty1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Alternatives_in_ruleInstantiationProperty1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group__0_in_ruleGroupElement1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Alternatives_in_rulePathElement1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddresses_in_rule__ConstructorAddressParameters__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressTuple_in_rule__ConstructorAddressParameters__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_rule__Member__Alternatives1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_rule__Member__Alternatives1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_rule__Member__Alternatives1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_rule__Member__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__0_in_rule__LinkProperty__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__0_in_rule__LinkProperty__Alternatives1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__0_in_rule__LinkProperty__Alternatives1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_rule__Expansion__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_rule__Expansion__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__SimpleAssignment_0_in_rule__Argument__Alternatives1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__0_in_rule__Argument__Alternatives1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__TextAssignment_2_in_rule__Argument__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_rule__AddressSpec__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_rule__AddressSpec__Alternatives1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Kind__Alternatives1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Kind__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__0_in_rule__InstantiationProperty__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_1__0_in_rule__InstantiationProperty__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__0_in_rule__InstantiationProperty__Alternatives1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__SimpleAssignment_0_in_rule__PathElement__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__0_in_rule__PathElement__Alternatives1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__0__Impl_in_rule__LinkSpec__Group__01990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__1_in_rule__LinkSpec__Group__01993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__LinkSpec__Group__0__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__1__Impl_in_rule__LinkSpec__Group__12052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__2_in_rule__LinkSpec__Group__12055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group_1__0_in_rule__LinkSpec__Group__1__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__2__Impl_in_rule__LinkSpec__Group__22113 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__3_in_rule__LinkSpec__Group__22116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__NameAssignment_2_in_rule__LinkSpec__Group__2__Impl2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__3__Impl_in_rule__LinkSpec__Group__32173 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__4_in_rule__LinkSpec__Group__32176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LinkSpec__Group__3__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__4__Impl_in_rule__LinkSpec__Group__42235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__ConstructorsAssignment_4_in_rule__LinkSpec__Group__4__Impl2262 = new BitSet(new long[]{0x0000000400000012L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group_1__0__Impl_in_rule__LinkSpec__Group_1__02303 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group_1__1_in_rule__LinkSpec__Group_1__02306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__PackagenameAssignment_1_0_in_rule__LinkSpec__Group_1__0__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group_1__1__Impl_in_rule__LinkSpec__Group_1__12363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LinkSpec__Group_1__1__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__02426 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__IsPublicAssignment_0_in_rule__Constructor__Group__0__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__12487 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__NameAssignment_1_in_rule__Constructor__Group__1__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__22547 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Constructor__Group__2__Impl2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__32609 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__32612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3__0_in_rule__Constructor__Group__3__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__42670 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__42673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Constructor__Group__4__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__52732 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__52735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_5__0_in_rule__Constructor__Group__5__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__62793 = new BitSet(new long[]{0x0000000001900010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__62796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Constructor__Group__6__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__72855 = new BitSet(new long[]{0x0000000001900010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__8_in_rule__Constructor__Group__72858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_7__0_in_rule__Constructor__Group__7__Impl2885 = new BitSet(new long[]{0x0000000001800012L});
    public static final BitSet FOLLOW_rule__Constructor__Group__8__Impl_in_rule__Constructor__Group__82916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Constructor__Group__8__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3__0__Impl_in_rule__Constructor__Group_3__02993 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3__1_in_rule__Constructor__Group_3__02996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ParametersAssignment_3_0_in_rule__Constructor__Group_3__0__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3__1__Impl_in_rule__Constructor__Group_3__13053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3_1__0_in_rule__Constructor__Group_3__1__Impl3080 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3_1__0__Impl_in_rule__Constructor__Group_3_1__03115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3_1__1_in_rule__Constructor__Group_3_1__03118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constructor__Group_3_1__0__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3_1__1__Impl_in_rule__Constructor__Group_3_1__13177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ParametersAssignment_3_1_1_in_rule__Constructor__Group_3_1__1__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_5__0__Impl_in_rule__Constructor__Group_5__03238 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Constructor__Group_5__1_in_rule__Constructor__Group_5__03241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constructor__Group_5__0__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_5__1__Impl_in_rule__Constructor__Group_5__13300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__AddressesAssignment_5_1_in_rule__Constructor__Group_5__1__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_7__0__Impl_in_rule__Constructor__Group_7__03361 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Constructor__Group_7__1_in_rule__Constructor__Group_7__03364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__MembersAssignment_7_0_in_rule__Constructor__Group_7__0__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_7__1__Impl_in_rule__Constructor__Group_7__13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Constructor__Group_7__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__0__Impl_in_rule__NamedAddresses__Group__03484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__1_in_rule__NamedAddresses__Group__03487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NamedAddresses__Group__0__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__1__Impl_in_rule__NamedAddresses__Group__13546 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__2_in_rule__NamedAddresses__Group__13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__AddressNamesAssignment_1_in_rule__NamedAddresses__Group__1__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__2__Impl_in_rule__NamedAddresses__Group__23606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__0_in_rule__NamedAddresses__Group__2__Impl3633 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__0__Impl_in_rule__NamedAddresses__Group_2__03670 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__1_in_rule__NamedAddresses__Group_2__03673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NamedAddresses__Group_2__0__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__1__Impl_in_rule__NamedAddresses__Group_2__13732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__2_in_rule__NamedAddresses__Group_2__13735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NamedAddresses__Group_2__1__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__2__Impl_in_rule__NamedAddresses__Group_2__23794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__AddressNamesAssignment_2_2_in_rule__NamedAddresses__Group_2__2__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__0__Impl_in_rule__AddressTuple__Group__03857 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__1_in_rule__AddressTuple__Group__03860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AddressTuple__Group__0__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__1__Impl_in_rule__AddressTuple__Group__13919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__2_in_rule__AddressTuple__Group__13922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AddressTuple__Group__1__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__2__Impl_in_rule__AddressTuple__Group__23981 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__3_in_rule__AddressTuple__Group__23984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__ElementsAssignment_2_in_rule__AddressTuple__Group__2__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__3__Impl_in_rule__AddressTuple__Group__34041 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__4_in_rule__AddressTuple__Group__34044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group_3__0_in_rule__AddressTuple__Group__3__Impl4071 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__4__Impl_in_rule__AddressTuple__Group__44102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AddressTuple__Group__4__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group_3__0__Impl_in_rule__AddressTuple__Group_3__04171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group_3__1_in_rule__AddressTuple__Group_3__04174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AddressTuple__Group_3__0__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group_3__1__Impl_in_rule__AddressTuple__Group_3__14233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__ElementsAssignment_3_1_in_rule__AddressTuple__Group_3__1__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__0__Impl_in_rule__TosNetLinkBinding__Group__04294 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__1_in_rule__TosNetLinkBinding__Group__04297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TosNetLinkBinding__Group__0__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__1__Impl_in_rule__TosNetLinkBinding__Group__14356 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__2_in_rule__TosNetLinkBinding__Group__14359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TosNetLinkBinding__Group__1__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__2__Impl_in_rule__TosNetLinkBinding__Group__24418 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__3_in_rule__TosNetLinkBinding__Group__24421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__PropertiesAssignment_2_in_rule__TosNetLinkBinding__Group__2__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__3__Impl_in_rule__TosNetLinkBinding__Group__34478 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__4_in_rule__TosNetLinkBinding__Group__34481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group_3__0_in_rule__TosNetLinkBinding__Group__3__Impl4508 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__4__Impl_in_rule__TosNetLinkBinding__Group__44539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TosNetLinkBinding__Group__4__Impl4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group_3__0__Impl_in_rule__TosNetLinkBinding__Group_3__04608 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group_3__1_in_rule__TosNetLinkBinding__Group_3__04611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TosNetLinkBinding__Group_3__0__Impl4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group_3__1__Impl_in_rule__TosNetLinkBinding__Group_3__14670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__PropertiesAssignment_3_1_in_rule__TosNetLinkBinding__Group_3__1__Impl4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__0__Impl_in_rule__LinkProperty__Group_0__04731 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__1_in_rule__LinkProperty__Group_0__04734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LinkProperty__Group_0__0__Impl4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__1__Impl_in_rule__LinkProperty__Group_0__14793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__2_in_rule__LinkProperty__Group_0__14796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LinkProperty__Group_0__1__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__2__Impl_in_rule__LinkProperty__Group_0__24855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__CtrlNameAssignment_0_2_in_rule__LinkProperty__Group_0__2__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__0__Impl_in_rule__LinkProperty__Group_1__04918 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__1_in_rule__LinkProperty__Group_1__04921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LinkProperty__Group_1__0__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__1__Impl_in_rule__LinkProperty__Group_1__14980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__2_in_rule__LinkProperty__Group_1__14983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LinkProperty__Group_1__1__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__2__Impl_in_rule__LinkProperty__Group_1__25042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__BaseValueAssignment_1_2_in_rule__LinkProperty__Group_1__2__Impl5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__0__Impl_in_rule__LinkProperty__Group_2__05105 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__1_in_rule__LinkProperty__Group_2__05108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LinkProperty__Group_2__0__Impl5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__1__Impl_in_rule__LinkProperty__Group_2__15167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__2_in_rule__LinkProperty__Group_2__15170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LinkProperty__Group_2__1__Impl5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__2__Impl_in_rule__LinkProperty__Group_2__25229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__UartNameAssignment_2_2_in_rule__LinkProperty__Group_2__2__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__0__Impl_in_rule__SimpleExpansion__Group__05292 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__1_in_rule__SimpleExpansion__Group__05295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__NameAssignment_0_in_rule__SimpleExpansion__Group__0__Impl5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__1__Impl_in_rule__SimpleExpansion__Group__15352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__2_in_rule__SimpleExpansion__Group__15355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SimpleExpansion__Group__1__Impl5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__2__Impl_in_rule__SimpleExpansion__Group__25414 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__3_in_rule__SimpleExpansion__Group__25417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__ConstructorAssignment_2_in_rule__SimpleExpansion__Group__2__Impl5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__3__Impl_in_rule__SimpleExpansion__Group__35474 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__4_in_rule__SimpleExpansion__Group__35477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SimpleExpansion__Group__3__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__4__Impl_in_rule__SimpleExpansion__Group__45536 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__5_in_rule__SimpleExpansion__Group__45539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4__0_in_rule__SimpleExpansion__Group__4__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__5__Impl_in_rule__SimpleExpansion__Group__55597 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__6_in_rule__SimpleExpansion__Group__55600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SimpleExpansion__Group__5__Impl5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__6__Impl_in_rule__SimpleExpansion__Group__65659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6__0_in_rule__SimpleExpansion__Group__6__Impl5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4__0__Impl_in_rule__SimpleExpansion__Group_4__05731 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4__1_in_rule__SimpleExpansion__Group_4__05734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__ArgumentsAssignment_4_0_in_rule__SimpleExpansion__Group_4__0__Impl5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4__1__Impl_in_rule__SimpleExpansion__Group_4__15791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4_1__0_in_rule__SimpleExpansion__Group_4__1__Impl5818 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4_1__0__Impl_in_rule__SimpleExpansion__Group_4_1__05853 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4_1__1_in_rule__SimpleExpansion__Group_4_1__05856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SimpleExpansion__Group_4_1__0__Impl5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4_1__1__Impl_in_rule__SimpleExpansion__Group_4_1__15915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__ArgumentsAssignment_4_1_1_in_rule__SimpleExpansion__Group_4_1__1__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6__0__Impl_in_rule__SimpleExpansion__Group_6__05976 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6__1_in_rule__SimpleExpansion__Group_6__05979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__BindingsAssignment_6_0_in_rule__SimpleExpansion__Group_6__0__Impl6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6__1__Impl_in_rule__SimpleExpansion__Group_6__16036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6_1__0_in_rule__SimpleExpansion__Group_6__1__Impl6063 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6_1__0__Impl_in_rule__SimpleExpansion__Group_6_1__06098 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6_1__1_in_rule__SimpleExpansion__Group_6_1__06101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SimpleExpansion__Group_6_1__0__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6_1__1__Impl_in_rule__SimpleExpansion__Group_6_1__16160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__BindingsAssignment_6_1_1_in_rule__SimpleExpansion__Group_6_1__1__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__0__Impl_in_rule__AddressExpansion__Group__06221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__1_in_rule__AddressExpansion__Group__06224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AddressExpansion__Group__0__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__1__Impl_in_rule__AddressExpansion__Group__16283 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__2_in_rule__AddressExpansion__Group__16286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__NameAssignment_1_in_rule__AddressExpansion__Group__1__Impl6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__2__Impl_in_rule__AddressExpansion__Group__26343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__3_in_rule__AddressExpansion__Group__26346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AddressExpansion__Group__2__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__3__Impl_in_rule__AddressExpansion__Group__36405 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__4_in_rule__AddressExpansion__Group__36408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__ConstructorAssignment_3_in_rule__AddressExpansion__Group__3__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__4__Impl_in_rule__AddressExpansion__Group__46465 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__5_in_rule__AddressExpansion__Group__46468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AddressExpansion__Group__4__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__5__Impl_in_rule__AddressExpansion__Group__56527 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__6_in_rule__AddressExpansion__Group__56530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5__0_in_rule__AddressExpansion__Group__5__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__6__Impl_in_rule__AddressExpansion__Group__66588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AddressExpansion__Group__6__Impl6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5__0__Impl_in_rule__AddressExpansion__Group_5__06661 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5__1_in_rule__AddressExpansion__Group_5__06664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__ArgumentsAssignment_5_0_in_rule__AddressExpansion__Group_5__0__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5__1__Impl_in_rule__AddressExpansion__Group_5__16721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5_1__0_in_rule__AddressExpansion__Group_5__1__Impl6748 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5_1__0__Impl_in_rule__AddressExpansion__Group_5_1__06783 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5_1__1_in_rule__AddressExpansion__Group_5_1__06786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AddressExpansion__Group_5_1__0__Impl6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5_1__1__Impl_in_rule__AddressExpansion__Group_5_1__16845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__ArgumentsAssignment_5_1_1_in_rule__AddressExpansion__Group_5_1__1__Impl6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__0__Impl_in_rule__Argument__Group_1__06906 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__1_in_rule__Argument__Group_1__06909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__LhsAssignment_1_0_in_rule__Argument__Group_1__0__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__1__Impl_in_rule__Argument__Group_1__16966 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__2_in_rule__Argument__Group_1__16969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Argument__Group_1__1__Impl6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__2__Impl_in_rule__Argument__Group_1__27028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__RhsAssignment_1_2_in_rule__Argument__Group_1__2__Impl7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__0__Impl_in_rule__AddressBinding__Group__07091 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__1_in_rule__AddressBinding__Group__07094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AddressBinding__Group__0__Impl7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__1__Impl_in_rule__AddressBinding__Group__17153 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__2_in_rule__AddressBinding__Group__17156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_1__0_in_rule__AddressBinding__Group__1__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__2__Impl_in_rule__AddressBinding__Group__27214 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__3_in_rule__AddressBinding__Group__27217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AddressBinding__Group__2__Impl7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__3__Impl_in_rule__AddressBinding__Group__37276 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__4_in_rule__AddressBinding__Group__37279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__AddressesAssignment_3_in_rule__AddressBinding__Group__3__Impl7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__4__Impl_in_rule__AddressBinding__Group__47336 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__5_in_rule__AddressBinding__Group__47339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_4__0_in_rule__AddressBinding__Group__4__Impl7366 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__5__Impl_in_rule__AddressBinding__Group__57397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AddressBinding__Group__5__Impl7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_1__0__Impl_in_rule__AddressBinding__Group_1__07468 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_1__1_in_rule__AddressBinding__Group_1__07471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__NameAssignment_1_0_in_rule__AddressBinding__Group_1__0__Impl7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_1__1__Impl_in_rule__AddressBinding__Group_1__17528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AddressBinding__Group_1__1__Impl7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_4__0__Impl_in_rule__AddressBinding__Group_4__07591 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_4__1_in_rule__AddressBinding__Group_4__07594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AddressBinding__Group_4__0__Impl7622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_4__1__Impl_in_rule__AddressBinding__Group_4__17653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__AddressesAssignment_4_1_in_rule__AddressBinding__Group_4__1__Impl7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__0__Impl_in_rule__Instantiation__Group__07714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__1_in_rule__Instantiation__Group__07717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Instantiation__Group__0__Impl7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__1__Impl_in_rule__Instantiation__Group__17776 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__2_in_rule__Instantiation__Group__17779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__AddressAssignment_1_in_rule__Instantiation__Group__1__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__2__Impl_in_rule__Instantiation__Group__27836 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__3_in_rule__Instantiation__Group__27839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Instantiation__Group__2__Impl7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__3__Impl_in_rule__Instantiation__Group__37898 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__4_in_rule__Instantiation__Group__37901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__KindAssignment_3_in_rule__Instantiation__Group__3__Impl7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__4__Impl_in_rule__Instantiation__Group__47958 = new BitSet(new long[]{0x00000001C0040000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__5_in_rule__Instantiation__Group__47961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Instantiation__Group__4__Impl7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__5__Impl_in_rule__Instantiation__Group__58020 = new BitSet(new long[]{0x00000001C0040000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__6_in_rule__Instantiation__Group__58023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5__0_in_rule__Instantiation__Group__5__Impl8050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__6__Impl_in_rule__Instantiation__Group__68081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Instantiation__Group__6__Impl8109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5__0__Impl_in_rule__Instantiation__Group_5__08154 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5__1_in_rule__Instantiation__Group_5__08157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__PropertiesAssignment_5_0_in_rule__Instantiation__Group_5__0__Impl8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5__1__Impl_in_rule__Instantiation__Group_5__18214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5_1__0_in_rule__Instantiation__Group_5__1__Impl8241 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5_1__0__Impl_in_rule__Instantiation__Group_5_1__08276 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5_1__1_in_rule__Instantiation__Group_5_1__08279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Instantiation__Group_5_1__0__Impl8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5_1__1__Impl_in_rule__Instantiation__Group_5_1__18338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__PropertiesAssignment_5_1_1_in_rule__Instantiation__Group_5_1__1__Impl8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__0__Impl_in_rule__DirectAddressSpec__Group__08399 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__1_in_rule__DirectAddressSpec__Group__08402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__NameAssignment_0_in_rule__DirectAddressSpec__Group__0__Impl8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__1__Impl_in_rule__DirectAddressSpec__Group__18459 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__2_in_rule__DirectAddressSpec__Group__18462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DirectAddressSpec__Group__1__Impl8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__2__Impl_in_rule__DirectAddressSpec__Group__28521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__AddressAssignment_2_in_rule__DirectAddressSpec__Group__2__Impl8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__0__Impl_in_rule__InstantiationProperty__Group_0__08584 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__1_in_rule__InstantiationProperty__Group_0__08587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__1__Impl_in_rule__InstantiationProperty__Group_0__18645 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__2_in_rule__InstantiationProperty__Group_0__18648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InstantiationProperty__Group_0__1__Impl8676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__2__Impl_in_rule__InstantiationProperty__Group_0__28707 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__3_in_rule__InstantiationProperty__Group_0__28710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__InstantiationProperty__Group_0__2__Impl8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__3__Impl_in_rule__InstantiationProperty__Group_0__38769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__IdAssignment_0_3_in_rule__InstantiationProperty__Group_0__3__Impl8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_1__0__Impl_in_rule__InstantiationProperty__Group_1__08834 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_1__1_in_rule__InstantiationProperty__Group_1__08837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_1__1__Impl_in_rule__InstantiationProperty__Group_1__18895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InstantiationProperty__Group_1__1__Impl8923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__0__Impl_in_rule__InstantiationProperty__Group_2__08958 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__1_in_rule__InstantiationProperty__Group_2__08961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__1__Impl_in_rule__InstantiationProperty__Group_2__19019 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__2_in_rule__InstantiationProperty__Group_2__19022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InstantiationProperty__Group_2__1__Impl9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__2__Impl_in_rule__InstantiationProperty__Group_2__29081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__3_in_rule__InstantiationProperty__Group_2__29084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__InstantiationProperty__Group_2__2__Impl9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__3__Impl_in_rule__InstantiationProperty__Group_2__39143 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__4_in_rule__InstantiationProperty__Group_2__39146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__ModeAssignment_2_3_in_rule__InstantiationProperty__Group_2__3__Impl9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__4__Impl_in_rule__InstantiationProperty__Group_2__49203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__5_in_rule__InstantiationProperty__Group_2__49206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InstantiationProperty__Group_2__4__Impl9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__5__Impl_in_rule__InstantiationProperty__Group_2__59265 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__6_in_rule__InstantiationProperty__Group_2__59268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__RateAssignment_2_5_in_rule__InstantiationProperty__Group_2__5__Impl9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__6__Impl_in_rule__InstantiationProperty__Group_2__69325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__InstantiationProperty__Group_2__6__Impl9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__09398 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__09401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_0_in_rule__Grouping__Group__0__Impl9428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__19458 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__19461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Grouping__Group__1__Impl9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__29520 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Grouping__Group__3_in_rule__Grouping__Group__29523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__ElementsAssignment_2_in_rule__Grouping__Group__2__Impl9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__3__Impl_in_rule__Grouping__Group__39580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_3__0_in_rule__Grouping__Group__3__Impl9607 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_3__0__Impl_in_rule__Grouping__Group_3__09646 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__Grouping__Group_3__1_in_rule__Grouping__Group_3__09649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Grouping__Group_3__0__Impl9677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_3__1__Impl_in_rule__Grouping__Group_3__19708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__ElementsAssignment_3_1_in_rule__Grouping__Group_3__1__Impl9735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group__0__Impl_in_rule__GroupElement__Group__09769 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__GroupElement__Group__1_in_rule__GroupElement__Group__09772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__PathAssignment_0_in_rule__GroupElement__Group__0__Impl9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group__1__Impl_in_rule__GroupElement__Group__19829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group_1__0_in_rule__GroupElement__Group__1__Impl9856 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group_1__0__Impl_in_rule__GroupElement__Group_1__09891 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__GroupElement__Group_1__1_in_rule__GroupElement__Group_1__09894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GroupElement__Group_1__0__Impl9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group_1__1__Impl_in_rule__GroupElement__Group_1__19953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__PathAssignment_1_1_in_rule__GroupElement__Group_1__1__Impl9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__0__Impl_in_rule__PathElement__Group_1__010014 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__1_in_rule__PathElement__Group_1__010017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PathElement__Group_1__0__Impl10045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__1__Impl_in_rule__PathElement__Group_1__110076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__2_in_rule__PathElement__Group_1__110079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PathElement__Group_1__1__Impl10107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__2__Impl_in_rule__PathElement__Group_1__210138 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__3_in_rule__PathElement__Group_1__210141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__TypeAssignment_1_2_in_rule__PathElement__Group_1__2__Impl10168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__3__Impl_in_rule__PathElement__Group_1__310198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PathElement__Group_1__3__Impl10226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkSpec__PackagenameAssignment_1_010270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkSpec__NameAssignment_210301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__LinkSpec__ConstructorsAssignment_410332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Constructor__IsPublicAssignment_010368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_110407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__ParametersAssignment_3_010438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__ParametersAssignment_3_1_110469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorAddressParameters_in_rule__Constructor__AddressesAssignment_5_110500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Constructor__MembersAssignment_7_010531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedAddresses__AddressNamesAssignment_110562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedAddresses__AddressNamesAssignment_2_210593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressTuple__ElementsAssignment_210624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressTuple__ElementsAssignment_3_110655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_rule__TosNetLinkBinding__PropertiesAssignment_210686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_rule__TosNetLinkBinding__PropertiesAssignment_3_110717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkProperty__CtrlNameAssignment_0_210748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LinkProperty__BaseValueAssignment_1_210779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkProperty__UartNameAssignment_2_210810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleExpansion__NameAssignment_010841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleExpansion__ConstructorAssignment_210876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__SimpleExpansion__ArgumentsAssignment_4_010911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__SimpleExpansion__ArgumentsAssignment_4_1_110942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_rule__SimpleExpansion__BindingsAssignment_6_010973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_rule__SimpleExpansion__BindingsAssignment_6_1_111004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressExpansion__NameAssignment_111035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressExpansion__ConstructorAssignment_311070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__AddressExpansion__ArgumentsAssignment_5_011105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__AddressExpansion__ArgumentsAssignment_5_1_111136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__SimpleAssignment_011167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__LhsAssignment_1_011198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argument__RhsAssignment_1_211229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__TextAssignment_211260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressBinding__NameAssignment_1_011291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_rule__AddressBinding__AddressesAssignment_311322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_rule__AddressBinding__AddressesAssignment_4_111353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_rule__Instantiation__AddressAssignment_111384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKind_in_rule__Instantiation__KindAssignment_311415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_rule__Instantiation__PropertiesAssignment_5_011446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_rule__Instantiation__PropertiesAssignment_5_1_111477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectAddressSpec__NameAssignment_011508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_rule__DirectAddressSpec__AddressAssignment_211539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedAddressSpec__NameAssignment11570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__InstantiationProperty__IdAssignment_0_311601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InstantiationProperty__ModeAssignment_2_311632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InstantiationProperty__RateAssignment_2_511663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Grouping__NameAssignment_011694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_rule__Grouping__ElementsAssignment_211725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_rule__Grouping__ElementsAssignment_3_111756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_rule__GroupElement__PathAssignment_011787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_rule__GroupElement__PathAssignment_1_111818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathElement__SimpleAssignment_011849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathElement__TypeAssignment_1_211884 = new BitSet(new long[]{0x0000000000000002L});

}