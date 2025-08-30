package com.coralberryfairy.site.model.doll;

import com.coralberryfairy.site.request.SiteRequest;
import com.coralberryfairy.site.page.PageLayout;
import com.coralberryfairy.site.model.BaseModel;
import org.computate.vertx.api.ApiRequest;
import com.coralberryfairy.site.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import java.util.Map;
import org.computate.vertx.search.list.SearchList;
import com.coralberryfairy.site.model.doll.Doll;
import java.lang.String;
import org.computate.search.response.solr.SolrResponse.Stats;
import org.computate.search.response.solr.SolrResponse.FacetCounts;
import io.vertx.core.json.JsonObject;
import org.computate.vertx.serialize.vertx.JsonObjectDeserializer;
import java.lang.Integer;
import java.time.ZoneId;
import java.util.Locale;
import java.lang.Long;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.math.BigDecimal;
import io.vertx.core.json.JsonArray;
import org.computate.vertx.serialize.vertx.JsonArrayDeserializer;
import java.lang.Void;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these DollGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class DollGenPageGen into the class DollGenPage. 
 * </li>
 * <h3>About the DollGenPage class and it's generated class DollGenPageGen&lt;PageLayout&gt;: </h3>extends DollGenPageGen
 * <p>
 * This Java class extends a generated Java class DollGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage">Find the class DollGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends DollGenPageGen<PageLayout>
 * <p>This <code>class DollGenPage extends DollGenPageGen&lt;PageLayout&gt;</code>, which means it extends a newly generated DollGenPageGen. 
 * The generated <code>class DollGenPageGen extends PageLayout</code> which means that DollGenPage extends DollGenPageGen which extends PageLayout. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <h2>ApiTag.enUS: true</h2>
 * <h2>ApiUri.enUS: null</h2>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the DollGenPage class will inherit the helpful inherited class comments from the super class DollGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the DollGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
 * </p>
 * <p>
 *   Adding protected void methods beginning with an underscore with a Promise as the only parameter will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   <pre>
 *   
 *   	protected void _promiseBefore(Promise&lt;Void&gt; promise) {
 *   		promise.complete();
 *   	}
 *   </pre>
 * </p>
 * <p>
 *   Java classes with the `Model: true` will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   If a super class of this Java class with `Model: true`, then the child class will also inherit `Promise: true`. 
 * </p>
 * <h2>AName.enUS: null</h2>
 * <p>
 * Delete the class DollGenPage in Solr: 
 * curl -k 'https://solr.apps-crc.testing/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package com.coralberryfairy.site.model.doll in Solr: 
 * curl -k 'https://solr.apps-crc.testing/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:com.coralberryfairy.site.model.doll&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project coralberryfairy in Solr: 
 * curl -k 'https://solr.apps-crc.testing/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:coralberryfairy&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class DollGenPageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(DollGenPage.class);

	/////////////////////
	// searchListDoll_ //
	/////////////////////


	/**	 The entity searchListDoll_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<Doll> searchListDoll_;

	/**	<br> The entity searchListDoll_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:searchListDoll_">Find the entity searchListDoll_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListDoll_(Wrap<SearchList<Doll>> w);

	public SearchList<Doll> getSearchListDoll_() {
		return searchListDoll_;
	}

	public void setSearchListDoll_(SearchList<Doll> searchListDoll_) {
		this.searchListDoll_ = searchListDoll_;
	}
	public static SearchList<Doll> staticSetSearchListDoll_(SiteRequest siteRequest_, String o) {
		return null;
	}
	protected DollGenPage searchListDoll_Init() {
		Wrap<SearchList<Doll>> searchListDoll_Wrap = new Wrap<SearchList<Doll>>().var("searchListDoll_");
		if(searchListDoll_ == null) {
			_searchListDoll_(searchListDoll_Wrap);
			Optional.ofNullable(searchListDoll_Wrap.getO()).ifPresent(o -> {
				setSearchListDoll_(o);
			});
		}
		return (DollGenPage)this;
	}

	//////////////
	// listDoll //
	//////////////


	/**	 The entity listDoll
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonDeserialize(using = JsonArrayDeserializer.class)
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listDoll = new JsonArray();

	/**	<br> The entity listDoll
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:listDoll">Find the entity listDoll in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listDoll(JsonArray l);

	public JsonArray getListDoll() {
		return listDoll;
	}

	public void setListDoll(JsonArray listDoll) {
		this.listDoll = listDoll;
	}
	@JsonIgnore
	public void setListDoll(String o) {
		this.listDoll = DollGenPage.staticSetListDoll(siteRequest_, o);
	}
	public static JsonArray staticSetListDoll(SiteRequest siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected DollGenPage listDollInit() {
		_listDoll(listDoll);
		return (DollGenPage)this;
	}

	public static String staticSearchListDoll(SiteRequest siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListDoll(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListDoll(SiteRequest siteRequest_, String o) {
		return DollGenPage.staticSearchListDoll(siteRequest_, DollGenPage.staticSetListDoll(siteRequest_, o)).toString();
	}

	/////////////////
	// resultCount //
	/////////////////


	/**	 The entity resultCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer resultCount;

	/**	<br> The entity resultCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:resultCount">Find the entity resultCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _resultCount(Wrap<Integer> w);

	public Integer getResultCount() {
		return resultCount;
	}

	public void setResultCount(Integer resultCount) {
		this.resultCount = resultCount;
	}
	@JsonIgnore
	public void setResultCount(String o) {
		this.resultCount = DollGenPage.staticSetResultCount(siteRequest_, o);
	}
	public static Integer staticSetResultCount(SiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected DollGenPage resultCountInit() {
		Wrap<Integer> resultCountWrap = new Wrap<Integer>().var("resultCount");
		if(resultCount == null) {
			_resultCount(resultCountWrap);
			Optional.ofNullable(resultCountWrap.getO()).ifPresent(o -> {
				setResultCount(o);
			});
		}
		return (DollGenPage)this;
	}

	public static Integer staticSearchResultCount(SiteRequest siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrResultCount(SiteRequest siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqResultCount(SiteRequest siteRequest_, String o) {
		return DollGenPage.staticSearchResultCount(siteRequest_, DollGenPage.staticSetResultCount(siteRequest_, o)).toString();
	}

	////////////
	// result //
	////////////


	/**	 The entity result
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Doll result;

	/**	<br> The entity result
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:result">Find the entity result in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _result(Wrap<Doll> w);

	public Doll getResult() {
		return result;
	}

	public void setResult(Doll result) {
		this.result = result;
	}
	public static Doll staticSetResult(SiteRequest siteRequest_, String o) {
		return null;
	}
	protected DollGenPage resultInit() {
		Wrap<Doll> resultWrap = new Wrap<Doll>().var("result");
		if(result == null) {
			_result(resultWrap);
			Optional.ofNullable(resultWrap.getO()).ifPresent(o -> {
				setResult(o);
			});
		}
		return (DollGenPage)this;
	}

	////////////
	// solrId //
	////////////


	/**	 The entity solrId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String solrId;

	/**	<br> The entity solrId
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:solrId">Find the entity solrId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _solrId(Wrap<String> w);

	public String getSolrId() {
		return solrId;
	}
	public void setSolrId(String o) {
		this.solrId = DollGenPage.staticSetSolrId(siteRequest_, o);
	}
	public static String staticSetSolrId(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected DollGenPage solrIdInit() {
		Wrap<String> solrIdWrap = new Wrap<String>().var("solrId");
		if(solrId == null) {
			_solrId(solrIdWrap);
			Optional.ofNullable(solrIdWrap.getO()).ifPresent(o -> {
				setSolrId(o);
			});
		}
		return (DollGenPage)this;
	}

	public static String staticSearchSolrId(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSolrId(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSolrId(SiteRequest siteRequest_, String o) {
		return DollGenPage.staticSearchSolrId(siteRequest_, DollGenPage.staticSetSolrId(siteRequest_, o)).toString();
	}

	/////////////////
	// pageUriDoll //
	/////////////////


	/**	 The entity pageUriDoll
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriDoll;

	/**	<br> The entity pageUriDoll
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:pageUriDoll">Find the entity pageUriDoll in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriDoll(Wrap<String> c);

	public String getPageUriDoll() {
		return pageUriDoll;
	}
	public void setPageUriDoll(String o) {
		this.pageUriDoll = DollGenPage.staticSetPageUriDoll(siteRequest_, o);
	}
	public static String staticSetPageUriDoll(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected DollGenPage pageUriDollInit() {
		Wrap<String> pageUriDollWrap = new Wrap<String>().var("pageUriDoll");
		if(pageUriDoll == null) {
			_pageUriDoll(pageUriDollWrap);
			Optional.ofNullable(pageUriDollWrap.getO()).ifPresent(o -> {
				setPageUriDoll(o);
			});
		}
		return (DollGenPage)this;
	}

	public static String staticSearchPageUriDoll(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriDoll(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriDoll(SiteRequest siteRequest_, String o) {
		return DollGenPage.staticSearchPageUriDoll(siteRequest_, DollGenPage.staticSetPageUriDoll(siteRequest_, o)).toString();
	}

	//////////////
	// initDeep //
	//////////////

	public Future<DollGenPageGen<DEV>> promiseDeepDollGenPage(SiteRequest siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepDollGenPage();
	}

	public Future<DollGenPageGen<DEV>> promiseDeepDollGenPage() {
		Promise<DollGenPageGen<DEV>> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseDollGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepPageLayout(siteRequest_).onSuccess(b -> {
				promise.complete(this);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseDollGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListDoll_Init();
				listDollInit();
				resultCountInit();
				resultInit();
				solrIdInit();
				pageUriDollInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override public Future<? extends DollGenPageGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
		return promiseDeepDollGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestDollGenPage(SiteRequest siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
	}

	public void siteRequestForClass(SiteRequest siteRequest_) {
		siteRequestDollGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainDollGenPage(v);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainDollGenPage(String var) {
		DollGenPage oDollGenPage = (DollGenPage)this;
		switch(var) {
			case "searchListDoll_":
				return oDollGenPage.searchListDoll_;
			case "listDoll":
				return oDollGenPage.listDoll;
			case "resultCount":
				return oDollGenPage.resultCount;
			case "result":
				return oDollGenPage.result;
			case "solrId":
				return oDollGenPage.solrId;
			case "pageUriDoll":
				return oDollGenPage.pageUriDoll;
			default:
				return super.obtainPageLayout(var);
		}
	}

	///////////////
	// relate //
	///////////////

	@Override public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateDollGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateDollGenPage(String var, Object val) {
		DollGenPage oDollGenPage = (DollGenPage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, DollGenPage o) {
		return staticSetDollGenPage(entityVar,  siteRequest_, v, o);
	}
	public static Object staticSetDollGenPage(String entityVar, SiteRequest siteRequest_, String v, DollGenPage o) {
		switch(entityVar) {
		case "listDoll":
			return DollGenPage.staticSetListDoll(siteRequest_, v);
		case "resultCount":
			return DollGenPage.staticSetResultCount(siteRequest_, v);
		case "solrId":
			return DollGenPage.staticSetSolrId(siteRequest_, v);
		case "pageUriDoll":
			return DollGenPage.staticSetPageUriDoll(siteRequest_, v);
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, v, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSearchDollGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchDollGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "listDoll":
			return DollGenPage.staticSearchListDoll(siteRequest_, (JsonArray)o);
		case "resultCount":
			return DollGenPage.staticSearchResultCount(siteRequest_, (Integer)o);
		case "solrId":
			return DollGenPage.staticSearchSolrId(siteRequest_, (String)o);
		case "pageUriDoll":
			return DollGenPage.staticSearchPageUriDoll(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSearchStrDollGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrDollGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "listDoll":
			return DollGenPage.staticSearchStrListDoll(siteRequest_, (String)o);
		case "resultCount":
			return DollGenPage.staticSearchStrResultCount(siteRequest_, (Integer)o);
		case "solrId":
			return DollGenPage.staticSearchStrSolrId(siteRequest_, (String)o);
		case "pageUriDoll":
			return DollGenPage.staticSearchStrPageUriDoll(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
		return staticSearchFqDollGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqDollGenPage(String entityVar, SiteRequest siteRequest_, String o) {
		switch(entityVar) {
		case "listDoll":
			return DollGenPage.staticSearchFqListDoll(siteRequest_, o);
		case "resultCount":
			return DollGenPage.staticSearchFqResultCount(siteRequest_, o);
		case "solrId":
			return DollGenPage.staticSearchFqSolrId(siteRequest_, o);
		case "pageUriDoll":
			return DollGenPage.staticSearchFqPageUriDoll(siteRequest_, o);
			default:
				return PageLayout.staticSearchFqPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "DollGenPage";
	public static final String CLASS_CANONICAL_NAME = "com.coralberryfairy.site.model.doll.DollGenPage";
	public static final String CLASS_AUTH_RESOURCE = "";
	public static final String VAR_searchListDoll_ = "searchListDoll_";
	public static final String VAR_listDoll = "listDoll";
	public static final String VAR_resultCount = "resultCount";
	public static final String VAR_result = "result";
	public static final String VAR_solrId = "solrId";
	public static final String VAR_pageUriDoll = "pageUriDoll";

	public static final String DISPLAY_NAME_searchListDoll_ = "";
	public static final String DISPLAY_NAME_listDoll = "";
	public static final String DISPLAY_NAME_resultCount = "";
	public static final String DISPLAY_NAME_result = "";
	public static final String DISPLAY_NAME_solrId = "";
	public static final String DISPLAY_NAME_pageUriDoll = "";

	@Override
	public String idForClass() {
		return null;
	}

	@Override
	public String titleForClass() {
		return null;
	}

	@Override
	public String nameForClass() {
		return null;
	}

	@Override
	public String classNameAdjectiveSingularForClass() {
		return null;
	}

	@Override
	public String descriptionForClass() {
		return null;
	}

	@Override
	public String classStringFormatUrlEditPageForClass() {
		return null;
	}

	@Override
	public String classStringFormatUrlDisplayPageForClass() {
		return null;
	}

	@Override
	public String classStringFormatUrlUserPageForClass() {
		return null;
	}

	@Override
	public String classStringFormatUrlDownloadForClass() {
		return null;
	}

	public static String displayNameForClass(String var) {
		return DollGenPage.displayNameDollGenPage(var);
	}
	public static String displayNameDollGenPage(String var) {
		switch(var) {
		case VAR_searchListDoll_:
			return DISPLAY_NAME_searchListDoll_;
		case VAR_listDoll:
			return DISPLAY_NAME_listDoll;
		case VAR_resultCount:
			return DISPLAY_NAME_resultCount;
		case VAR_result:
			return DISPLAY_NAME_result;
		case VAR_solrId:
			return DISPLAY_NAME_solrId;
		case VAR_pageUriDoll:
			return DISPLAY_NAME_pageUriDoll;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}

	public static String descriptionDollGenPage(String var) {
		if(var == null)
			return null;
		switch(var) {
			default:
				return PageLayout.descriptionPageLayout(var);
		}
	}

	public static String classSimpleNameDollGenPage(String var) {
		switch(var) {
		case VAR_searchListDoll_:
			return "SearchList";
		case VAR_listDoll:
			return "JsonArray";
		case VAR_resultCount:
			return "Integer";
		case VAR_result:
			return "Doll";
		case VAR_solrId:
			return "String";
		case VAR_pageUriDoll:
			return "String";
			default:
				return PageLayout.classSimpleNamePageLayout(var);
		}
	}

	public static Integer htmColumnDollGenPage(String var) {
		switch(var) {
			default:
				return PageLayout.htmColumnPageLayout(var);
		}
	}

	public static Integer htmRowDollGenPage(String var) {
		switch(var) {
			default:
				return PageLayout.htmRowPageLayout(var);
		}
	}

	public static Integer htmCellDollGenPage(String var) {
		switch(var) {
			default:
				return PageLayout.htmCellPageLayout(var);
		}
	}

	public static Integer lengthMinDollGenPage(String var) {
		switch(var) {
			default:
				return PageLayout.lengthMinPageLayout(var);
		}
	}

	public static Integer lengthMaxDollGenPage(String var) {
		switch(var) {
			default:
				return PageLayout.lengthMaxPageLayout(var);
		}
	}

	public static Integer maxDollGenPage(String var) {
		switch(var) {
			default:
				return PageLayout.maxPageLayout(var);
		}
	}

	public static Integer minDollGenPage(String var) {
		switch(var) {
			default:
				return PageLayout.minPageLayout(var);
		}
	}
}
