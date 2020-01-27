package org.tasks.data;

import com.google.common.base.Strings;

public class SubsetGoogleTask {

  public long gt_id;
  public long gt_parent;
  public String gt_list_id;
  public long gt_order;
  public String gt_email_description;
  public String gt_email_url;

  public long getId() {
    return gt_id;
  }

  public String getListId() {
    return gt_list_id;
  }

  public long getParent() {
    return gt_parent;
  }

  public void setParent(long parent) {
    gt_parent = parent;
  }

  public long getOrder() {
    return gt_order;
  }

  public void setOrder(long order) {
    gt_order = order;
  }

  public int getIndent() {
    return gt_parent > 0 ? 1 : 0;
  }

  public String getEmailDescription() {
    return gt_email_description;
  }

  public String getEmailUrl() {
    return gt_email_url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SubsetGoogleTask)) {
      return false;
    }

    SubsetGoogleTask that = (SubsetGoogleTask) o;

    if (gt_id != that.gt_id) {
      return false;
    }
    if (gt_parent != that.gt_parent) {
      return false;
    }
    if (gt_order != that.gt_order) {
      return false;
    }
    if (gt_list_id != null ? !gt_list_id.equals(that.gt_list_id) : that.gt_list_id != null) {
      return false;
    }
    if (gt_email_description != null
        ? !gt_email_description.equals(that.gt_email_description)
        : that.gt_email_description != null) {
      return false;
    }
    return gt_email_url != null
        ? gt_email_url.equals(that.gt_email_url)
        : that.gt_email_url == null;
  }

  @Override
  public int hashCode() {
    int result = (int) (gt_id ^ (gt_id >>> 32));
    result = 31 * result + (int) (gt_parent ^ (gt_parent >>> 32));
    result = 31 * result + (gt_list_id != null ? gt_list_id.hashCode() : 0);
    result = 31 * result + (int) (gt_order ^ (gt_order >>> 32));
    result = 31 * result + (gt_email_description != null ? gt_email_description.hashCode() : 0);
    result = 31 * result + (gt_email_url != null ? gt_email_url.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "SubsetGoogleTask{"
        + "gt_id="
        + gt_id
        + ", gt_parent="
        + gt_parent
        + ", gt_list_id='"
        + gt_list_id
        + '\''
        + ", gt_order="
        + gt_order
        + ", gt_email_description='"
        + gt_email_description
        + '\''
        + ", gt_email_url='"
        + gt_email_url
        + '\''
        + '}';
  }

  public boolean hasRelatedEmail() {
    return !Strings.isNullOrEmpty(gt_email_url);
  }
}
