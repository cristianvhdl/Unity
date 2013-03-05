package dk.sdu.mmmi.embedix.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.embedix.services.ULSWIGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalULSWIGParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX_NUM", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "';'", "'public'", "'('", "','", "')'", "':'", "'{'", "'}'", "'@'", "'TOSNET'", "'CTRL'", "'='", "'BASE'", "'UART'", "'+'", "'READ'", "'WRITE'", "'ID'", "'CRC'", "'PUBLISH'", "'.'", "'ALL'"
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
    public String getGrammarFileName() { return "../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g"; }



     	private ULSWIGGrammarAccess grammarAccess;
     	
        public InternalULSWIGParser(TokenStream input, ULSWIGGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LinkSpec";	
       	}
       	
       	@Override
       	protected ULSWIGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLinkSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:67:1: entryRuleLinkSpec returns [EObject current=null] : iv_ruleLinkSpec= ruleLinkSpec EOF ;
    public final EObject entryRuleLinkSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:68:2: (iv_ruleLinkSpec= ruleLinkSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:69:2: iv_ruleLinkSpec= ruleLinkSpec EOF
            {
             newCompositeNode(grammarAccess.getLinkSpecRule()); 
            pushFollow(FOLLOW_ruleLinkSpec_in_entryRuleLinkSpec75);
            iv_ruleLinkSpec=ruleLinkSpec();

            state._fsp--;

             current =iv_ruleLinkSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkSpec85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkSpec"


    // $ANTLR start "ruleLinkSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:76:1: ruleLinkSpec returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )* ) ;
    public final EObject ruleLinkSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_constructors_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:79:28: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleLinkSpec122); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkSpecAccess().getLinkKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:85:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkSpec139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLinkSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLinkSpec156); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkSpecAccess().getSemicolonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:106:1: ( (lv_constructors_3_0= ruleConstructor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:107:1: (lv_constructors_3_0= ruleConstructor )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:107:1: (lv_constructors_3_0= ruleConstructor )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:108:3: lv_constructors_3_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkSpecAccess().getConstructorsConstructorParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleLinkSpec177);
            	    lv_constructors_3_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkSpecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_3_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkSpec"


    // $ANTLR start "entryRuleConstructor"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:132:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:133:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:134:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor214);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor224); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:141:1: ruleConstructor returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_isPublic_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_parameters_3_0=null;
        Token otherlv_4=null;
        Token lv_parameters_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_addresses_8_0 = null;

        EObject lv_addresses_10_0 = null;

        EObject lv_members_12_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:144:28: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:145:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:145:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:145:2: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}'
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:145:2: ( (lv_isPublic_0_0= 'public' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:146:1: (lv_isPublic_0_0= 'public' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:146:1: (lv_isPublic_0_0= 'public' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:147:3: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,14,FOLLOW_14_in_ruleConstructor267); 

                            newLeafNode(lv_isPublic_0_0, grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                           		setWithLastConsumed(current, "isPublic", true, "public");
                    	    

                    }


                    }
                    break;

            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:160:3: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:161:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:161:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:162:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor298); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstructorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleConstructor315); 

                	newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:182:1: ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:182:2: ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:182:2: ( (lv_parameters_3_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:183:1: (lv_parameters_3_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:183:1: (lv_parameters_3_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:184:3: lv_parameters_3_0= RULE_ID
                    {
                    lv_parameters_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor333); 

                    			newLeafNode(lv_parameters_3_0, grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:200:2: (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:200:4: otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConstructor351); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:204:1: ( (lv_parameters_5_0= RULE_ID ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:205:1: (lv_parameters_5_0= RULE_ID )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:205:1: (lv_parameters_5_0= RULE_ID )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:206:3: lv_parameters_5_0= RULE_ID
                    	    {
                    	    lv_parameters_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor368); 

                    	    			newLeafNode(lv_parameters_5_0, grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleConstructor389); 

                	newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:226:1: (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:226:3: otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )*
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleConstructor402); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getColonKeyword_5_0());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:230:1: ( (lv_addresses_8_0= ruleAddress ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:231:1: (lv_addresses_8_0= ruleAddress )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:231:1: (lv_addresses_8_0= ruleAddress )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:232:3: lv_addresses_8_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getAddressesAddressParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleConstructor423);
                    lv_addresses_8_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	        }
                           		add(
                           			current, 
                           			"addresses",
                            		lv_addresses_8_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:248:2: (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:248:4: otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleConstructor436); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getConstructorAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:252:1: ( (lv_addresses_10_0= ruleAddress ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:253:1: (lv_addresses_10_0= ruleAddress )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:253:1: (lv_addresses_10_0= ruleAddress )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:254:3: lv_addresses_10_0= ruleAddress
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstructorAccess().getAddressesAddressParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddress_in_ruleConstructor457);
                    	    lv_addresses_10_0=ruleAddress();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"addresses",
                    	            		lv_addresses_10_0, 
                    	            		"Address");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleConstructor473); 

                	newLeafNode(otherlv_11, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:274:1: ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=21 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:274:2: ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';'
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:274:2: ( (lv_members_12_0= ruleMember ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:275:1: (lv_members_12_0= ruleMember )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:275:1: (lv_members_12_0= ruleMember )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:276:3: lv_members_12_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getMembersMemberParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleConstructor495);
            	    lv_members_12_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_12_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleConstructor507); 

            	        	newLeafNode(otherlv_13, grammarAccess.getConstructorAccess().getSemicolonKeyword_7_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleConstructor521); 

                	newLeafNode(otherlv_14, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleAddress"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:308:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:309:2: (iv_ruleAddress= ruleAddress EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:310:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_ruleAddress_in_entryRuleAddress557);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddress567); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:317:1: ruleAddress returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_elements_4_0=null;
        Token otherlv_5=null;
        Token lv_elements_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:320:28: ( ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:321:1: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:321:1: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    alt9=1;
                }
                else if ( (LA9_1==15) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:321:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:321:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:321:4: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAddress605); 

                        	newLeafNode(otherlv_0, grammarAccess.getAddressAccess().getCommercialAtKeyword_0_0());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:325:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:326:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:326:1: (lv_name_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:327:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddress622); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getAddressAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAddressRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:344:6: (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:344:6: (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:344:8: otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleAddress647); 

                        	newLeafNode(otherlv_2, grammarAccess.getAddressAccess().getCommercialAtKeyword_1_0());
                        
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAddress659); 

                        	newLeafNode(otherlv_3, grammarAccess.getAddressAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:352:1: ( (lv_elements_4_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:353:1: (lv_elements_4_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:353:1: (lv_elements_4_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:354:3: lv_elements_4_0= RULE_ID
                    {
                    lv_elements_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddress676); 

                    			newLeafNode(lv_elements_4_0, grammarAccess.getAddressAccess().getElementsIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAddressRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"elements",
                            		lv_elements_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:370:2: (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:370:4: otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAddress694); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAddressAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:374:1: ( (lv_elements_6_0= RULE_ID ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:375:1: (lv_elements_6_0= RULE_ID )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:375:1: (lv_elements_6_0= RULE_ID )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:376:3: lv_elements_6_0= RULE_ID
                    	    {
                    	    lv_elements_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddress711); 

                    	    			newLeafNode(lv_elements_6_0, grammarAccess.getAddressAccess().getElementsIDTerminalRuleCall_1_3_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAddressRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_6_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleAddress730); 

                        	newLeafNode(otherlv_7, grammarAccess.getAddressAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleMember"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:404:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:405:2: (iv_ruleMember= ruleMember EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:406:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember767);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember777); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:413:1: ruleMember returns [EObject current=null] : (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_LinkBinding_0 = null;

        EObject this_Expansion_1 = null;

        EObject this_Instantiation_2 = null;

        EObject this_Grouping_3 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:416:28: ( (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:417:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:417:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==24) ) {
                    alt10=4;
                }
                else if ( (LA10_2==18) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==RULE_ID) ) {
                    int LA10_6 = input.LA(3);

                    if ( (LA10_6==18) ) {
                        int LA10_7 = input.LA(4);

                        if ( (LA10_7==RULE_ID) ) {
                            alt10=2;
                        }
                        else if ( ((LA10_7>=28 && LA10_7<=29)) ) {
                            alt10=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA10_6==24) ) {
                        alt10=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:418:5: this_LinkBinding_0= ruleLinkBinding
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getLinkBindingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLinkBinding_in_ruleMember824);
                    this_LinkBinding_0=ruleLinkBinding();

                    state._fsp--;

                     
                            current = this_LinkBinding_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:428:5: this_Expansion_1= ruleExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getExpansionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpansion_in_ruleMember851);
                    this_Expansion_1=ruleExpansion();

                    state._fsp--;

                     
                            current = this_Expansion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:438:5: this_Instantiation_2= ruleInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getInstantiationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstantiation_in_ruleMember878);
                    this_Instantiation_2=ruleInstantiation();

                    state._fsp--;

                     
                            current = this_Instantiation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:448:5: this_Grouping_3= ruleGrouping
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getGroupingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGrouping_in_ruleMember905);
                    this_Grouping_3=ruleGrouping();

                    state._fsp--;

                     
                            current = this_Grouping_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:464:1: entryRuleLinkBinding returns [EObject current=null] : iv_ruleLinkBinding= ruleLinkBinding EOF ;
    public final EObject entryRuleLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:465:2: (iv_ruleLinkBinding= ruleLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:466:2: iv_ruleLinkBinding= ruleLinkBinding EOF
            {
             newCompositeNode(grammarAccess.getLinkBindingRule()); 
            pushFollow(FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding940);
            iv_ruleLinkBinding=ruleLinkBinding();

            state._fsp--;

             current =iv_ruleLinkBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkBinding950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkBinding"


    // $ANTLR start "ruleLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:473:1: ruleLinkBinding returns [EObject current=null] : this_TosNetLinkBinding_0= ruleTosNetLinkBinding ;
    public final EObject ruleLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject this_TosNetLinkBinding_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:476:28: (this_TosNetLinkBinding_0= ruleTosNetLinkBinding )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:478:5: this_TosNetLinkBinding_0= ruleTosNetLinkBinding
            {
             
                    newCompositeNode(grammarAccess.getLinkBindingAccess().getTosNetLinkBindingParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding996);
            this_TosNetLinkBinding_0=ruleTosNetLinkBinding();

            state._fsp--;

             
                    current = this_TosNetLinkBinding_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkBinding"


    // $ANTLR start "entryRuleTosNetLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:494:1: entryRuleTosNetLinkBinding returns [EObject current=null] : iv_ruleTosNetLinkBinding= ruleTosNetLinkBinding EOF ;
    public final EObject entryRuleTosNetLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTosNetLinkBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:495:2: (iv_ruleTosNetLinkBinding= ruleTosNetLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:496:2: iv_ruleTosNetLinkBinding= ruleTosNetLinkBinding EOF
            {
             newCompositeNode(grammarAccess.getTosNetLinkBindingRule()); 
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding1030);
            iv_ruleTosNetLinkBinding=ruleTosNetLinkBinding();

            state._fsp--;

             current =iv_ruleTosNetLinkBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTosNetLinkBinding1040); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTosNetLinkBinding"


    // $ANTLR start "ruleTosNetLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:503:1: ruleTosNetLinkBinding returns [EObject current=null] : (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' ) ;
    public final EObject ruleTosNetLinkBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:506:28: ( (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:507:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:507:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:507:3: otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTosNetLinkBinding1077); 

                	newLeafNode(otherlv_0, grammarAccess.getTosNetLinkBindingAccess().getTOSNETKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleTosNetLinkBinding1089); 

                	newLeafNode(otherlv_1, grammarAccess.getTosNetLinkBindingAccess().getLeftParenthesisKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:515:1: ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:515:2: ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:515:2: ( (lv_properties_2_0= ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:516:1: (lv_properties_2_0= ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:516:1: (lv_properties_2_0= ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:517:3: lv_properties_2_0= ruleLinkProperty
            {
             
            	        newCompositeNode(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1111);
            lv_properties_2_0=ruleLinkProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTosNetLinkBindingRule());
            	        }
                   		add(
                   			current, 
                   			"properties",
                    		lv_properties_2_0, 
                    		"LinkProperty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:533:2: (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:533:4: otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) )
            {
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTosNetLinkBinding1124); 

                	newLeafNode(otherlv_3, grammarAccess.getTosNetLinkBindingAccess().getCommaKeyword_2_1_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:537:1: ( (lv_properties_4_0= ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:538:1: (lv_properties_4_0= ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:538:1: (lv_properties_4_0= ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:539:3: lv_properties_4_0= ruleLinkProperty
            {
             
            	        newCompositeNode(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1145);
            lv_properties_4_0=ruleLinkProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTosNetLinkBindingRule());
            	        }
                   		add(
                   			current, 
                   			"properties",
                    		lv_properties_4_0, 
                    		"LinkProperty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTosNetLinkBinding1159); 

                	newLeafNode(otherlv_5, grammarAccess.getTosNetLinkBindingAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTosNetLinkBinding"


    // $ANTLR start "entryRuleLinkProperty"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:567:1: entryRuleLinkProperty returns [EObject current=null] : iv_ruleLinkProperty= ruleLinkProperty EOF ;
    public final EObject entryRuleLinkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:568:2: (iv_ruleLinkProperty= ruleLinkProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:569:2: iv_ruleLinkProperty= ruleLinkProperty EOF
            {
             newCompositeNode(grammarAccess.getLinkPropertyRule()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1195);
            iv_ruleLinkProperty=ruleLinkProperty();

            state._fsp--;

             current =iv_ruleLinkProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkProperty1205); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkProperty"


    // $ANTLR start "ruleLinkProperty"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:576:1: ruleLinkProperty returns [EObject current=null] : ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) ) ;
    public final EObject ruleLinkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ctrlName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_baseValue_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_uartName_8_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:579:28: ( ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:580:1: ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:580:1: ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:580:2: (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:580:2: (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:580:4: otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleLinkProperty1243); 

                        	newLeafNode(otherlv_0, grammarAccess.getLinkPropertyAccess().getCTRLKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleLinkProperty1255); 

                        	newLeafNode(otherlv_1, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_0_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:588:1: ( (lv_ctrlName_2_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:589:1: (lv_ctrlName_2_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:589:1: (lv_ctrlName_2_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:590:3: lv_ctrlName_2_0= RULE_ID
                    {
                    lv_ctrlName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProperty1272); 

                    			newLeafNode(lv_ctrlName_2_0, grammarAccess.getLinkPropertyAccess().getCtrlNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ctrlName",
                            		lv_ctrlName_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:607:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:607:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:607:8: otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleLinkProperty1297); 

                        	newLeafNode(otherlv_3, grammarAccess.getLinkPropertyAccess().getBASEKeyword_1_0());
                        
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleLinkProperty1309); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:615:1: ( (lv_baseValue_5_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:616:1: (lv_baseValue_5_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:616:1: (lv_baseValue_5_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:617:3: lv_baseValue_5_0= RULE_INT
                    {
                    lv_baseValue_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLinkProperty1326); 

                    			newLeafNode(lv_baseValue_5_0, grammarAccess.getLinkPropertyAccess().getBaseValueINTTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"baseValue",
                            		lv_baseValue_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:634:6: (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:634:6: (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:634:8: otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleLinkProperty1351); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkPropertyAccess().getUARTKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleLinkProperty1363); 

                        	newLeafNode(otherlv_7, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_2_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:642:1: ( (lv_uartName_8_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:643:1: (lv_uartName_8_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:643:1: (lv_uartName_8_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:644:3: lv_uartName_8_0= RULE_ID
                    {
                    lv_uartName_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProperty1380); 

                    			newLeafNode(lv_uartName_8_0, grammarAccess.getLinkPropertyAccess().getUartNameIDTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"uartName",
                            		lv_uartName_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkProperty"


    // $ANTLR start "entryRuleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:668:1: entryRuleExpansion returns [EObject current=null] : iv_ruleExpansion= ruleExpansion EOF ;
    public final EObject entryRuleExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:669:2: (iv_ruleExpansion= ruleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:670:2: iv_ruleExpansion= ruleExpansion EOF
            {
             newCompositeNode(grammarAccess.getExpansionRule()); 
            pushFollow(FOLLOW_ruleExpansion_in_entryRuleExpansion1422);
            iv_ruleExpansion=ruleExpansion();

            state._fsp--;

             current =iv_ruleExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpansion1432); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpansion"


    // $ANTLR start "ruleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:677:1: ruleExpansion returns [EObject current=null] : (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion ) ;
    public final EObject ruleExpansion() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExpansion_0 = null;

        EObject this_AddressExpansion_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:680:28: ( (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:681:1: (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:681:1: (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:682:5: this_SimpleExpansion_0= ruleSimpleExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionAccess().getSimpleExpansionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleExpansion_in_ruleExpansion1479);
                    this_SimpleExpansion_0=ruleSimpleExpansion();

                    state._fsp--;

                     
                            current = this_SimpleExpansion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:692:5: this_AddressExpansion_1= ruleAddressExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionAccess().getAddressExpansionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressExpansion_in_ruleExpansion1506);
                    this_AddressExpansion_1=ruleAddressExpansion();

                    state._fsp--;

                     
                            current = this_AddressExpansion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpansion"


    // $ANTLR start "entryRuleSimpleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:708:1: entryRuleSimpleExpansion returns [EObject current=null] : iv_ruleSimpleExpansion= ruleSimpleExpansion EOF ;
    public final EObject entryRuleSimpleExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:709:2: (iv_ruleSimpleExpansion= ruleSimpleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:710:2: iv_ruleSimpleExpansion= ruleSimpleExpansion EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpansionRule()); 
            pushFollow(FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion1541);
            iv_ruleSimpleExpansion=ruleSimpleExpansion();

            state._fsp--;

             current =iv_ruleSimpleExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpansion1551); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleExpansion"


    // $ANTLR start "ruleSimpleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:717:1: ruleSimpleExpansion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? ) ;
    public final EObject ruleSimpleExpansion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_bindings_8_0 = null;

        EObject lv_bindings_10_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:720:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:721:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:721:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:721:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )?
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:721:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:722:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:722:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:723:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleExpansion1593); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSimpleExpansionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleExpansionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSimpleExpansion1610); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleExpansionAccess().getColonKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:743:1: ( (otherlv_2= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:744:1: (otherlv_2= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:744:1: (otherlv_2= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:745:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleExpansionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleExpansion1630); 

            		newLeafNode(otherlv_2, grammarAccess.getSimpleExpansionAccess().getConstructorConstructorCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSimpleExpansion1642); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleExpansionAccess().getLeftParenthesisKeyword_3());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:760:1: ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:760:2: ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:760:2: ( (lv_arguments_4_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:761:1: (lv_arguments_4_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:761:1: (lv_arguments_4_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:762:3: lv_arguments_4_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleSimpleExpansion1664);
                    lv_arguments_4_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleExpansionRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_4_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:778:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:778:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSimpleExpansion1677); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSimpleExpansionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:782:1: ( (lv_arguments_6_0= ruleArgument ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:783:1: (lv_arguments_6_0= ruleArgument )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:783:1: (lv_arguments_6_0= ruleArgument )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:784:3: lv_arguments_6_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleSimpleExpansion1698);
                    	    lv_arguments_6_0=ruleArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleExpansionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_6_0, 
                    	            		"Argument");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleSimpleExpansion1714); 

                	newLeafNode(otherlv_7, grammarAccess.getSimpleExpansionAccess().getRightParenthesisKeyword_5());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:804:1: ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:804:2: ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:804:2: ( (lv_bindings_8_0= ruleAddressBinding ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:805:1: (lv_bindings_8_0= ruleAddressBinding )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:805:1: (lv_bindings_8_0= ruleAddressBinding )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:806:3: lv_bindings_8_0= ruleAddressBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1736);
                    lv_bindings_8_0=ruleAddressBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleExpansionRule());
                    	        }
                           		add(
                           			current, 
                           			"bindings",
                            		lv_bindings_8_0, 
                            		"AddressBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:822:2: (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:822:4: otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSimpleExpansion1749); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSimpleExpansionAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:826:1: ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:827:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:827:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:828:3: lv_bindings_10_0= ruleAddressBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1770);
                    	    lv_bindings_10_0=ruleAddressBinding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleExpansionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"bindings",
                    	            		lv_bindings_10_0, 
                    	            		"AddressBinding");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleExpansion"


    // $ANTLR start "entryRuleAddressExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:852:1: entryRuleAddressExpansion returns [EObject current=null] : iv_ruleAddressExpansion= ruleAddressExpansion EOF ;
    public final EObject entryRuleAddressExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:853:2: (iv_ruleAddressExpansion= ruleAddressExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:854:2: iv_ruleAddressExpansion= ruleAddressExpansion EOF
            {
             newCompositeNode(grammarAccess.getAddressExpansionRule()); 
            pushFollow(FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion1810);
            iv_ruleAddressExpansion=ruleAddressExpansion();

            state._fsp--;

             current =iv_ruleAddressExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressExpansion1820); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddressExpansion"


    // $ANTLR start "ruleAddressExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:861:1: ruleAddressExpansion returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleAddressExpansion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:864:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:865:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:865:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:865:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAddressExpansion1857); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressExpansionAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:869:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:870:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:870:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:871:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressExpansion1874); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAddressExpansionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressExpansionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAddressExpansion1891); 

                	newLeafNode(otherlv_2, grammarAccess.getAddressExpansionAccess().getColonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:891:1: ( (otherlv_3= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:892:1: (otherlv_3= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:892:1: (otherlv_3= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:893:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressExpansionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressExpansion1911); 

            		newLeafNode(otherlv_3, grammarAccess.getAddressExpansionAccess().getConstructorConstructorCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAddressExpansion1923); 

                	newLeafNode(otherlv_4, grammarAccess.getAddressExpansionAccess().getLeftParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:908:1: ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:908:2: ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:908:2: ( (lv_arguments_5_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:909:1: (lv_arguments_5_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:909:1: (lv_arguments_5_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:910:3: lv_arguments_5_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleAddressExpansion1945);
                    lv_arguments_5_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAddressExpansionRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_5_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:926:2: (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:926:4: otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleAddressExpansion1958); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAddressExpansionAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:930:1: ( (lv_arguments_7_0= ruleArgument ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:931:1: (lv_arguments_7_0= ruleArgument )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:931:1: (lv_arguments_7_0= ruleArgument )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:932:3: lv_arguments_7_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleAddressExpansion1979);
                    	    lv_arguments_7_0=ruleArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAddressExpansionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_7_0, 
                    	            		"Argument");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleAddressExpansion1995); 

                	newLeafNode(otherlv_8, grammarAccess.getAddressExpansionAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressExpansion"


    // $ANTLR start "entryRuleArgument"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:960:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:961:2: (iv_ruleArgument= ruleArgument EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:962:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument2031);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument2041); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:969:1: ruleArgument returns [EObject current=null] : ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_simple_0_0=null;
        Token lv_lhs_1_0=null;
        Token otherlv_2=null;
        Token lv_text_4_0=null;
        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:972:28: ( ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:973:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:973:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||(LA19_1>=16 && LA19_1<=17)) ) {
                    alt19=1;
                }
                else if ( (LA19_1==27) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:973:2: ( (lv_simple_0_0= RULE_ID ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:973:2: ( (lv_simple_0_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:974:1: (lv_simple_0_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:974:1: (lv_simple_0_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:975:3: lv_simple_0_0= RULE_ID
                    {
                    lv_simple_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2083); 

                    			newLeafNode(lv_simple_0_0, grammarAccess.getArgumentAccess().getSimpleIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"simple",
                            		lv_simple_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:992:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:992:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:992:7: ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:992:7: ( (lv_lhs_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:993:1: (lv_lhs_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:993:1: (lv_lhs_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:994:3: lv_lhs_1_0= RULE_ID
                    {
                    lv_lhs_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2112); 

                    			newLeafNode(lv_lhs_1_0, grammarAccess.getArgumentAccess().getLhsIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lhs",
                            		lv_lhs_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleArgument2129); 

                        	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getPlusSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1014:1: ( (lv_rhs_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1015:1: (lv_rhs_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1015:1: (lv_rhs_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1016:3: lv_rhs_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getRhsArgumentParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleArgument2150);
                    lv_rhs_3_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_3_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1033:6: ( (lv_text_4_0= RULE_STRING ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1033:6: ( (lv_text_4_0= RULE_STRING ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1034:1: (lv_text_4_0= RULE_STRING )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1034:1: (lv_text_4_0= RULE_STRING )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1035:3: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument2174); 

                    			newLeafNode(lv_text_4_0, grammarAccess.getArgumentAccess().getTextSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAddressBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1059:1: entryRuleAddressBinding returns [EObject current=null] : iv_ruleAddressBinding= ruleAddressBinding EOF ;
    public final EObject entryRuleAddressBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1060:2: (iv_ruleAddressBinding= ruleAddressBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1061:2: iv_ruleAddressBinding= ruleAddressBinding EOF
            {
             newCompositeNode(grammarAccess.getAddressBindingRule()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding2215);
            iv_ruleAddressBinding=ruleAddressBinding();

            state._fsp--;

             current =iv_ruleAddressBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressBinding2225); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddressBinding"


    // $ANTLR start "ruleAddressBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1068:1: ruleAddressBinding returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleAddressBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_addresses_4_0=null;
        Token otherlv_5=null;
        Token lv_addresses_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1071:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1072:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1072:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1072:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAddressBinding2262); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressBindingAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1076:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1077:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1077:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1078:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressBinding2279); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAddressBindingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAddressBinding2296); 

                	newLeafNode(otherlv_2, grammarAccess.getAddressBindingAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAddressBinding2308); 

                	newLeafNode(otherlv_3, grammarAccess.getAddressBindingAccess().getLeftParenthesisKeyword_3());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1102:1: ( (lv_addresses_4_0= RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1103:1: (lv_addresses_4_0= RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1103:1: (lv_addresses_4_0= RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1104:3: lv_addresses_4_0= RULE_HEX_NUM
            {
            lv_addresses_4_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2325); 

            			newLeafNode(lv_addresses_4_0, grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressBindingRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"addresses",
                    		lv_addresses_4_0, 
                    		"HEX_NUM");
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1120:2: (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1120:4: otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAddressBinding2343); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAddressBindingAccess().getCommaKeyword_5_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1124:1: ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1125:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1125:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1126:3: lv_addresses_6_0= RULE_HEX_NUM
            	    {
            	    lv_addresses_6_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2360); 

            	    			newLeafNode(lv_addresses_6_0, grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAddressBindingRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"addresses",
            	            		lv_addresses_6_0, 
            	            		"HEX_NUM");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleAddressBinding2379); 

                	newLeafNode(otherlv_7, grammarAccess.getAddressBindingAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressBinding"


    // $ANTLR start "entryRuleInstantiation"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1154:1: entryRuleInstantiation returns [EObject current=null] : iv_ruleInstantiation= ruleInstantiation EOF ;
    public final EObject entryRuleInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiation = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1155:2: (iv_ruleInstantiation= ruleInstantiation EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1156:2: iv_ruleInstantiation= ruleInstantiation EOF
            {
             newCompositeNode(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_ruleInstantiation_in_entryRuleInstantiation2415);
            iv_ruleInstantiation=ruleInstantiation();

            state._fsp--;

             current =iv_ruleInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiation2425); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstantiation"


    // $ANTLR start "ruleInstantiation"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1163:1: ruleInstantiation returns [EObject current=null] : (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_address_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_3_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_properties_7_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1166:28: ( (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1167:1: (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1167:1: (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1167:3: otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleInstantiation2462); 

                	newLeafNode(otherlv_0, grammarAccess.getInstantiationAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1171:1: ( (lv_address_1_0= ruleAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1172:1: (lv_address_1_0= ruleAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1172:1: (lv_address_1_0= ruleAddressSpec )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1173:3: lv_address_1_0= ruleAddressSpec
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getAddressAddressSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAddressSpec_in_ruleInstantiation2483);
            lv_address_1_0=ruleAddressSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"address",
                    		lv_address_1_0, 
                    		"AddressSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleInstantiation2495); 

                	newLeafNode(otherlv_2, grammarAccess.getInstantiationAccess().getColonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1193:1: ( (lv_kind_3_0= ruleKind ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1194:1: (lv_kind_3_0= ruleKind )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1194:1: (lv_kind_3_0= ruleKind )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1195:3: lv_kind_3_0= ruleKind
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getKindKindParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleKind_in_ruleInstantiation2516);
            lv_kind_3_0=ruleKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_3_0, 
                    		"Kind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleInstantiation2528); 

                	newLeafNode(otherlv_4, grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1215:1: ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=30 && LA22_0<=32)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1215:2: ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1215:2: ( (lv_properties_5_0= ruleInstantiationProperty ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1216:1: (lv_properties_5_0= ruleInstantiationProperty )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1216:1: (lv_properties_5_0= ruleInstantiationProperty )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1217:3: lv_properties_5_0= ruleInstantiationProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2550);
                    lv_properties_5_0=ruleInstantiationProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                    	        }
                           		add(
                           			current, 
                           			"properties",
                            		lv_properties_5_0, 
                            		"InstantiationProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1233:2: (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1233:4: otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleInstantiation2563); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getInstantiationAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1237:1: ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1238:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1238:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1239:3: lv_properties_7_0= ruleInstantiationProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2584);
                    	    lv_properties_7_0=ruleInstantiationProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_7_0, 
                    	            		"InstantiationProperty");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleInstantiation2600); 

                	newLeafNode(otherlv_8, grammarAccess.getInstantiationAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstantiation"


    // $ANTLR start "entryRuleAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1267:1: entryRuleAddressSpec returns [EObject current=null] : iv_ruleAddressSpec= ruleAddressSpec EOF ;
    public final EObject entryRuleAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1268:2: (iv_ruleAddressSpec= ruleAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1269:2: iv_ruleAddressSpec= ruleAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getAddressSpecRule()); 
            pushFollow(FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec2636);
            iv_ruleAddressSpec=ruleAddressSpec();

            state._fsp--;

             current =iv_ruleAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressSpec2646); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddressSpec"


    // $ANTLR start "ruleAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1276:1: ruleAddressSpec returns [EObject current=null] : (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec ) ;
    public final EObject ruleAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject this_DirectAddressSpec_0 = null;

        EObject this_NamedAddressSpec_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1279:28: ( (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1280:1: (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1280:1: (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==24) ) {
                    alt23=1;
                }
                else if ( (LA23_1==EOF||LA23_1==18) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1281:5: this_DirectAddressSpec_0= ruleDirectAddressSpec
                    {
                     
                            newCompositeNode(grammarAccess.getAddressSpecAccess().getDirectAddressSpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDirectAddressSpec_in_ruleAddressSpec2693);
                    this_DirectAddressSpec_0=ruleDirectAddressSpec();

                    state._fsp--;

                     
                            current = this_DirectAddressSpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1291:5: this_NamedAddressSpec_1= ruleNamedAddressSpec
                    {
                     
                            newCompositeNode(grammarAccess.getAddressSpecAccess().getNamedAddressSpecParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamedAddressSpec_in_ruleAddressSpec2720);
                    this_NamedAddressSpec_1=ruleNamedAddressSpec();

                    state._fsp--;

                     
                            current = this_NamedAddressSpec_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressSpec"


    // $ANTLR start "entryRuleDirectAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1307:1: entryRuleDirectAddressSpec returns [EObject current=null] : iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF ;
    public final EObject entryRuleDirectAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1308:2: (iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1309:2: iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getDirectAddressSpecRule()); 
            pushFollow(FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec2755);
            iv_ruleDirectAddressSpec=ruleDirectAddressSpec();

            state._fsp--;

             current =iv_ruleDirectAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectAddressSpec2765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectAddressSpec"


    // $ANTLR start "ruleDirectAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1316:1: ruleDirectAddressSpec returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) ) ;
    public final EObject ruleDirectAddressSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_address_2_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1319:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1320:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1320:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1320:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1320:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1321:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1321:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1322:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectAddressSpec2807); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDirectAddressSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDirectAddressSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDirectAddressSpec2824); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectAddressSpecAccess().getEqualsSignKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1342:1: ( (lv_address_2_0= RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1343:1: (lv_address_2_0= RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1343:1: (lv_address_2_0= RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1344:3: lv_address_2_0= RULE_HEX_NUM
            {
            lv_address_2_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleDirectAddressSpec2841); 

            			newLeafNode(lv_address_2_0, grammarAccess.getDirectAddressSpecAccess().getAddressHEX_NUMTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDirectAddressSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_2_0, 
                    		"HEX_NUM");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectAddressSpec"


    // $ANTLR start "entryRuleNamedAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1368:1: entryRuleNamedAddressSpec returns [EObject current=null] : iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF ;
    public final EObject entryRuleNamedAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1369:2: (iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1370:2: iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getNamedAddressSpecRule()); 
            pushFollow(FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec2882);
            iv_ruleNamedAddressSpec=ruleNamedAddressSpec();

            state._fsp--;

             current =iv_ruleNamedAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddressSpec2892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedAddressSpec"


    // $ANTLR start "ruleNamedAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1377:1: ruleNamedAddressSpec returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNamedAddressSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1380:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1381:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1381:1: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1382:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1382:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1383:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedAddressSpec2933); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNamedAddressSpecAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedAddressSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedAddressSpec"


    // $ANTLR start "entryRuleKind"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1407:1: entryRuleKind returns [String current=null] : iv_ruleKind= ruleKind EOF ;
    public final String entryRuleKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKind = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1408:2: (iv_ruleKind= ruleKind EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1409:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_ruleKind_in_entryRuleKind2974);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKind2985); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1416:1: ruleKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1419:28: ( (kw= 'READ' | kw= 'WRITE' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1420:1: (kw= 'READ' | kw= 'WRITE' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1420:1: (kw= 'READ' | kw= 'WRITE' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            else if ( (LA24_0==29) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1421:2: kw= 'READ'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleKind3023); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKindAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1428:2: kw= 'WRITE'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleKind3042); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKindAccess().getWRITEKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleInstantiationProperty"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1441:1: entryRuleInstantiationProperty returns [EObject current=null] : iv_ruleInstantiationProperty= ruleInstantiationProperty EOF ;
    public final EObject entryRuleInstantiationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1442:2: (iv_ruleInstantiationProperty= ruleInstantiationProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1443:2: iv_ruleInstantiationProperty= ruleInstantiationProperty EOF
            {
             newCompositeNode(grammarAccess.getInstantiationPropertyRule()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty3082);
            iv_ruleInstantiationProperty=ruleInstantiationProperty();

            state._fsp--;

             current =iv_ruleInstantiationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationProperty3092); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstantiationProperty"


    // $ANTLR start "ruleInstantiationProperty"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1450:1: ruleInstantiationProperty returns [EObject current=null] : ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleInstantiationProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_mode_9_0=null;
        Token otherlv_10=null;
        Token lv_rate_11_0=null;
        Token otherlv_12=null;
        EObject lv_id_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1453:28: ( ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1454:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1454:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                alt25=2;
                }
                break;
            case 32:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1454:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1454:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1454:3: () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1454:3: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1455:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getIDPropertyAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleInstantiationProperty3139); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstantiationPropertyAccess().getIDKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleInstantiationProperty3151); 

                        	newLeafNode(otherlv_2, grammarAccess.getInstantiationPropertyAccess().getEqualsSignKeyword_0_2());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1468:1: ( (lv_id_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1469:1: (lv_id_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1469:1: (lv_id_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1470:3: lv_id_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleInstantiationProperty3172);
                    lv_id_3_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstantiationPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1487:6: ( () otherlv_5= 'CRC' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1487:6: ( () otherlv_5= 'CRC' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1487:7: () otherlv_5= 'CRC'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1487:7: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1488:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getCRCPropertyAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleInstantiationProperty3201); 

                        	newLeafNode(otherlv_5, grammarAccess.getInstantiationPropertyAccess().getCRCKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1498:6: ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1498:6: ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1498:7: () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1498:7: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1499:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getPublishPopertyAction_2_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleInstantiationProperty3230); 

                        	newLeafNode(otherlv_7, grammarAccess.getInstantiationPropertyAccess().getPUBLISHKeyword_2_1());
                        
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInstantiationProperty3242); 

                        	newLeafNode(otherlv_8, grammarAccess.getInstantiationPropertyAccess().getLeftParenthesisKeyword_2_2());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1512:1: ( (lv_mode_9_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1513:1: (lv_mode_9_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1513:1: (lv_mode_9_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1514:3: lv_mode_9_0= RULE_INT
                    {
                    lv_mode_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstantiationProperty3259); 

                    			newLeafNode(lv_mode_9_0, grammarAccess.getInstantiationPropertyAccess().getModeINTTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstantiationPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"mode",
                            		lv_mode_9_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleInstantiationProperty3276); 

                        	newLeafNode(otherlv_10, grammarAccess.getInstantiationPropertyAccess().getCommaKeyword_2_4());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1534:1: ( (lv_rate_11_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1535:1: (lv_rate_11_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1535:1: (lv_rate_11_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1536:3: lv_rate_11_0= RULE_INT
                    {
                    lv_rate_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstantiationProperty3293); 

                    			newLeafNode(lv_rate_11_0, grammarAccess.getInstantiationPropertyAccess().getRateINTTerminalRuleCall_2_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstantiationPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rate",
                            		lv_rate_11_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleInstantiationProperty3310); 

                        	newLeafNode(otherlv_12, grammarAccess.getInstantiationPropertyAccess().getRightParenthesisKeyword_2_6());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstantiationProperty"


    // $ANTLR start "entryRuleGrouping"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1564:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1565:2: (iv_ruleGrouping= ruleGrouping EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1566:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping3347);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping3357); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrouping"


    // $ANTLR start "ruleGrouping"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1573:1: ruleGrouping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1576:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1577:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1577:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1577:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )*
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1577:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1578:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1578:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1579:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrouping3399); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGroupingAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleGrouping3416); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupingAccess().getEqualsSignKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1599:1: ( (lv_elements_2_0= ruleGroupElement ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1600:1: (lv_elements_2_0= ruleGroupElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1600:1: (lv_elements_2_0= ruleGroupElement )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1601:3: lv_elements_2_0= ruleGroupElement
            {
             
            	        newCompositeNode(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGroupElement_in_ruleGrouping3437);
            lv_elements_2_0=ruleGroupElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupingRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"GroupElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1617:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1617:4: otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleGrouping3450); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGroupingAccess().getCommaKeyword_3_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1621:1: ( (lv_elements_4_0= ruleGroupElement ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1622:1: (lv_elements_4_0= ruleGroupElement )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1622:1: (lv_elements_4_0= ruleGroupElement )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1623:3: lv_elements_4_0= ruleGroupElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroupElement_in_ruleGrouping3471);
            	    lv_elements_4_0=ruleGroupElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"GroupElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrouping"


    // $ANTLR start "entryRuleGroupElement"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1647:1: entryRuleGroupElement returns [EObject current=null] : iv_ruleGroupElement= ruleGroupElement EOF ;
    public final EObject entryRuleGroupElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupElement = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1648:2: (iv_ruleGroupElement= ruleGroupElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1649:2: iv_ruleGroupElement= ruleGroupElement EOF
            {
             newCompositeNode(grammarAccess.getGroupElementRule()); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement3509);
            iv_ruleGroupElement=ruleGroupElement();

            state._fsp--;

             current =iv_ruleGroupElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement3519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupElement"


    // $ANTLR start "ruleGroupElement"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1656:1: ruleGroupElement returns [EObject current=null] : ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* ) ;
    public final EObject ruleGroupElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1659:28: ( ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1660:1: ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1660:1: ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1660:2: ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )*
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1660:2: ( (lv_path_0_0= rulePathElement ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1661:1: (lv_path_0_0= rulePathElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1661:1: (lv_path_0_0= rulePathElement )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1662:3: lv_path_0_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleGroupElement3565);
            lv_path_0_0=rulePathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupElementRule());
            	        }
                   		add(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"PathElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1678:2: (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1678:4: otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleGroupElement3578); 

            	        	newLeafNode(otherlv_1, grammarAccess.getGroupElementAccess().getFullStopKeyword_1_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1682:1: ( (lv_path_2_0= rulePathElement ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1683:1: (lv_path_2_0= rulePathElement )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1683:1: (lv_path_2_0= rulePathElement )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1684:3: lv_path_2_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleGroupElement3599);
            	    lv_path_2_0=rulePathElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"path",
            	            		lv_path_2_0, 
            	            		"PathElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupElement"


    // $ANTLR start "entryRulePathElement"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1708:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1709:2: (iv_rulePathElement= rulePathElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1710:2: iv_rulePathElement= rulePathElement EOF
            {
             newCompositeNode(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement3637);
            iv_rulePathElement=rulePathElement();

            state._fsp--;

             current =iv_rulePathElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement3647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1717:1: rulePathElement returns [EObject current=null] : ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token lv_simple_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1720:28: ( ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1721:1: ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1721:1: ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==34) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1721:2: ( (lv_simple_0_0= RULE_ID ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1721:2: ( (lv_simple_0_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1722:1: (lv_simple_0_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1722:1: (lv_simple_0_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1723:3: lv_simple_0_0= RULE_ID
                    {
                    lv_simple_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement3689); 

                    			newLeafNode(lv_simple_0_0, grammarAccess.getPathElementAccess().getSimpleIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPathElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"simple",
                            		lv_simple_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1740:6: (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1740:6: (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1740:8: otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_rulePathElement3713); 

                        	newLeafNode(otherlv_1, grammarAccess.getPathElementAccess().getALLKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePathElement3725); 

                        	newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1748:1: ( (otherlv_3= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1749:1: (otherlv_3= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1749:1: (otherlv_3= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1750:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPathElementRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement3745); 

                    		newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getTypeConstructorCrossReference_1_2_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePathElement3757); 

                        	newLeafNode(otherlv_4, grammarAccess.getPathElementAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLinkSpec_in_entryRuleLinkSpec75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkSpec85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLinkSpec122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkSpec139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLinkSpec156 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleLinkSpec177 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleConstructor267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor298 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstructor315 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor333 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleConstructor351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor368 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleConstructor389 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleConstructor402 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleConstructor423 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleConstructor436 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleConstructor457 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleConstructor473 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleConstructor495 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstructor507 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_20_in_ruleConstructor521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddress567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAddress605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddress622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAddress647 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAddress659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddress676 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAddress694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddress711 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleAddress730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_ruleMember824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_ruleMember851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_ruleMember878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleMember905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkBinding950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTosNetLinkBinding1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTosNetLinkBinding1077 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTosNetLinkBinding1089 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1111 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTosNetLinkBinding1124 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1145 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTosNetLinkBinding1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkProperty1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLinkProperty1243 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLinkProperty1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProperty1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLinkProperty1297 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLinkProperty1309 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLinkProperty1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLinkProperty1351 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLinkProperty1363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProperty1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_entryRuleExpansion1422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpansion1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_ruleExpansion1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_ruleExpansion1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpansion1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleExpansion1593 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSimpleExpansion1610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleExpansion1630 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSimpleExpansion1642 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleSimpleExpansion1664 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleSimpleExpansion1677 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleSimpleExpansion1698 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleSimpleExpansion1714 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1736 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleSimpleExpansion1749 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1770 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion1810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressExpansion1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAddressExpansion1857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressExpansion1874 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAddressExpansion1891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressExpansion1911 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAddressExpansion1923 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleAddressExpansion1945 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAddressExpansion1958 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleAddressExpansion1979 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleAddressExpansion1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2112 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleArgument2129 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding2215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressBinding2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAddressBinding2262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressBinding2279 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAddressBinding2296 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAddressBinding2308 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2325 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAddressBinding2343 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2360 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleAddressBinding2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInstantiation2462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_ruleInstantiation2483 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInstantiation2495 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleKind_in_ruleInstantiation2516 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstantiation2528 = new BitSet(new long[]{0x00000001C0020000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2550 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInstantiation2563 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2584 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInstantiation2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec2636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressSpec2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_ruleAddressSpec2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_ruleAddressSpec2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec2755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectAddressSpec2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectAddressSpec2807 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDirectAddressSpec2824 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleDirectAddressSpec2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddressSpec2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedAddressSpec2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKind_in_entryRuleKind2974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKind2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleKind3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleKind3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty3082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationProperty3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInstantiationProperty3139 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInstantiationProperty3151 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleInstantiationProperty3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInstantiationProperty3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInstantiationProperty3230 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstantiationProperty3242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstantiationProperty3259 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInstantiationProperty3276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstantiationProperty3293 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInstantiationProperty3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping3347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrouping3399 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleGrouping3416 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleGrouping3437 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleGrouping3450 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleGrouping3471 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement3509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleGroupElement3565 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleGroupElement3578 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleGroupElement3599 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement3637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePathElement3713 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePathElement3725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement3745 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePathElement3757 = new BitSet(new long[]{0x0000000000000002L});

}